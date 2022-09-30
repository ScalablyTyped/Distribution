package typings.mendixmodelsdk.allModelClassesMod.domainmodels

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AssociationType")
@js.native
open class AssociationType protected ()
  extends typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AssociationType {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AssociationType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AssociationType.Reference")
  @js.native
  def Reference: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AssociationType.ReferenceSet")
  @js.native
  def ReferenceSet: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationType = js.native
  inline def ReferenceSet_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
  
  inline def Reference_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
}
