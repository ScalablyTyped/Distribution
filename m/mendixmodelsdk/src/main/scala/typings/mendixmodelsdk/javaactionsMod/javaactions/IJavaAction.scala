package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.codeactionsMod.codeactions.ICodeAction
import typings.mendixmodelsdk.instancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/java-actions relevant section in reference guide}
  */
@js.native
trait IJavaAction extends ICodeAction {
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  val javaReturnType: IType = js.native
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  val microflowActionInfo: IMicroflowActionInfo | Null = js.native
  
  /**
    * In version 7.21.0: deleted
    */
  val parameters: IList[IJavaActionParameter] = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  val returnType: String | Null = js.native
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  val typeParameters: IList[ITypeParameter] = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  val useLegacyCodeGeneration: Boolean = js.native
}
