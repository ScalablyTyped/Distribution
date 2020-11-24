package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICrossAssociation extends IAssociationBase {
  
  /**
    * This property is required and cannot be set to null.
    */
  val child: IEntity = js.native
  
  val childQualifiedName: String = js.native
}
