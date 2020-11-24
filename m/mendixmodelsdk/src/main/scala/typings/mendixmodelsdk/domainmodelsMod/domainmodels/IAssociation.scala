package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/associations relevant section in reference guide}
  */
@js.native
trait IAssociation extends IAssociationBase {
  
  /**
    * This property is required and cannot be set to null.
    */
  val child: IEntity = js.native
}
