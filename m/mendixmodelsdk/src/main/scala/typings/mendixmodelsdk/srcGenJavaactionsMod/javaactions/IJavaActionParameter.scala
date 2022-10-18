package typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.ICodeActionParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJavaActionParameter
  extends StObject
     with ICodeActionParameter {
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 6.7.0: deleted
    * In version 6.6.0: introduced
    */
  val javaType: IType = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  val parameterType: IParameterType = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  val `type`: String | Null = js.native
}
