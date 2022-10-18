package typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@js.native
trait IConcreteEntityType
  extends StObject
     with IEntityType {
  
  /**
    * This property is required and cannot be set to null.
    */
  val entity: IEntity = js.native
  
  val entityQualifiedName: String = js.native
}
