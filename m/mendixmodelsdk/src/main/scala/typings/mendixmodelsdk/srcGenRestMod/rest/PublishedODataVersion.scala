package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataVersion")
@js.native
open class PublishedODataVersion protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object PublishedODataVersion {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataVersion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataVersion.OData3")
  @js.native
  def OData3: PublishedODataVersion = js.native
  inline def OData3_=(x: PublishedODataVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OData3")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataVersion.OData4")
  @js.native
  def OData4: PublishedODataVersion = js.native
  inline def OData4_=(x: PublishedODataVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OData4")(x.asInstanceOf[js.Any])
}
