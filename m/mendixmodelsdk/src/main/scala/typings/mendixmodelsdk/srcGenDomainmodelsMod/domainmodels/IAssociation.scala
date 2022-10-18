package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/associations relevant section in reference guide}
  */
@js.native
trait IAssociation
  extends StObject
     with IAssociationBase {
  
  /**
    * This property is required and cannot be set to null.
    */
  val child: IEntity = js.native
}
