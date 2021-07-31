package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataVersion")
@js.native
class ODataVersion protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ODataVersion {
  
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataVersion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataVersion.OData2")
  @js.native
  def OData2: ODataVersion = js.native
  @scala.inline
  def OData2_=(x: ODataVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OData2")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataVersion.OData3")
  @js.native
  def OData3: ODataVersion = js.native
  @scala.inline
  def OData3_=(x: ODataVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OData3")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataVersion.OData4")
  @js.native
  def OData4: ODataVersion = js.native
  @scala.inline
  def OData4_=(x: ODataVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OData4")(x.asInstanceOf[js.Any])
}
