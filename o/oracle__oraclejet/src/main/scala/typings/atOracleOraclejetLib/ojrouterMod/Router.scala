package typings
package atOracleOraclejetLib.ojrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  var defaultStateId: js.UndefOr[java.lang.String] = js.native
  val direction: js.UndefOr[java.lang.String] = js.native
  val moduleConfig: atOracleOraclejetLib.Anon_LifecycleListener = js.native
  val name: java.lang.String = js.native
  @JSName("observableModuleConfig")
  val observableModuleConfig_Original: knockoutLib.KnockoutObservable[atOracleOraclejetLib.ojrouterMod.RouterNs.ModuleConfigType] = js.native
  val parent: js.UndefOr[Router] = js.native
  val states: js.Array[RouterState] | scala.Null = js.native
  def configure(option: js.Function1[/* id */ java.lang.String, js.UndefOr[RouterState | scala.Null]]): js.Any = js.native
  def configure(
    option: org.scalablytyped.runtime.StringDictionary[atOracleOraclejetLib.ojrouterMod.RouterStateNs.ConfigOptions]
  ): js.Any = js.native
  def createChildRouter(name: java.lang.String): Router = js.native
  def createChildRouter(name: java.lang.String, parentStateId: java.lang.String): Router = js.native
  def currentState(): js.UndefOr[RouterState] = js.native
  def currentValue(): js.UndefOr[java.lang.String] = js.native
  def dispose(): js.UndefOr[scala.Nothing] = js.native
  def getChildRouter(name: java.lang.String): js.UndefOr[Router] = js.native
  def getCurrentChildRouter(): js.UndefOr[Router] = js.native
  def getState(stateId: java.lang.String): js.UndefOr[RouterState] = js.native
  def go(): js.Promise[atOracleOraclejetLib.Anon_HasChanged] = js.native
  def go(stateIdPath: java.lang.String): js.Promise[atOracleOraclejetLib.Anon_HasChanged] = js.native
  def go(stateIdPath: java.lang.String, options: atOracleOraclejetLib.Anon_HistoryUpdate): js.Promise[atOracleOraclejetLib.Anon_HasChanged] = js.native
  def go(stateIdPath: js.Array[java.lang.String]): js.Promise[atOracleOraclejetLib.Anon_HasChanged] = js.native
  def go(stateIdPath: js.Array[java.lang.String], options: atOracleOraclejetLib.Anon_HistoryUpdate): js.Promise[atOracleOraclejetLib.Anon_HasChanged] = js.native
  def observableModuleConfig(): atOracleOraclejetLib.ojrouterMod.RouterNs.ModuleConfigType = js.native
  def observableModuleConfig(value: atOracleOraclejetLib.ojrouterMod.RouterNs.ModuleConfigType): scala.Unit = js.native
  def retrieve(): js.Any = js.native
  def stateId(): java.lang.String = js.native
  def stateId(param0: java.lang.String): java.lang.String = js.native
  def store(data: js.Object): js.UndefOr[scala.Nothing] = js.native
}

