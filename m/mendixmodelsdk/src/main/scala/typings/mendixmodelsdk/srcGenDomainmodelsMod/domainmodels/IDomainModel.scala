package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/domain-model relevant section in reference guide}
  */
@js.native
trait IDomainModel
  extends StObject
     with IModuleDocument {
  
  val associations: IList[IAssociation] = js.native
  
  val crossAssociations: IList[ICrossAssociation] = js.native
  
  /**
    * In version 9.10.0: added public
    */
  val documentation: String = js.native
  
  val entities: IList[IEntity] = js.native
}
