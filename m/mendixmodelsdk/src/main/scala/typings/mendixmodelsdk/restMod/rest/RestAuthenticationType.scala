package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/rest", "rest.RestAuthenticationType")
@js.native
open class RestAuthenticationType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object RestAuthenticationType {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestAuthenticationType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestAuthenticationType.Basic")
  @js.native
  def Basic: RestAuthenticationType = js.native
  inline def Basic_=(x: RestAuthenticationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Basic")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestAuthenticationType.Guest")
  @js.native
  def Guest: RestAuthenticationType = js.native
  inline def Guest_=(x: RestAuthenticationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Guest")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestAuthenticationType.Microflow")
  @js.native
  def Microflow: RestAuthenticationType = js.native
  inline def Microflow_=(x: RestAuthenticationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Microflow")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestAuthenticationType.None")
  @js.native
  def None: RestAuthenticationType = js.native
  inline def None_=(x: RestAuthenticationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestAuthenticationType.Session")
  @js.native
  def Session: RestAuthenticationType = js.native
  inline def Session_=(x: RestAuthenticationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Session")(x.asInstanceOf[js.Any])
}
