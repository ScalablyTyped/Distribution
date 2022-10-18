package typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICodeAction
  extends StObject
     with IDocument {
  
  /**
    * In version 7.21.0: introduced
    */
  val actionParameters: IList[ICodeActionParameter] = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: introduced
    */
  val actionReturnType: IType = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  val actionTypeParameters: IList[ITypeParameter] = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  val modelerActionInfo: IMicroflowActionInfo | Null = js.native
}
