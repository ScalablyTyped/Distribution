package typings.mendixmodelsdk.mod.rest

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "rest.PublishedODataVersion")
@js.native
open class PublishedODataVersion protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.rest.PublishedODataVersion {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object PublishedODataVersion {
  
  @JSImport("mendixmodelsdk", "rest.PublishedODataVersion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.PublishedODataVersion.OData3")
  @js.native
  def OData3: typings.mendixmodelsdk.restMod.rest.PublishedODataVersion = js.native
  inline def OData3_=(x: typings.mendixmodelsdk.restMod.rest.PublishedODataVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OData3")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.PublishedODataVersion.OData4")
  @js.native
  def OData4: typings.mendixmodelsdk.restMod.rest.PublishedODataVersion = js.native
  inline def OData4_=(x: typings.mendixmodelsdk.restMod.rest.PublishedODataVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OData4")(x.asInstanceOf[js.Any])
}
