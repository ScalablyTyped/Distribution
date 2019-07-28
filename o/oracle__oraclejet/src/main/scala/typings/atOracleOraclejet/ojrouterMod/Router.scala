package typings.atOracleOraclejet.ojrouterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.Anon_HasChanged
import typings.atOracleOraclejet.Anon_HistoryUpdate
import typings.atOracleOraclejet.Anon_LifecycleListener
import typings.atOracleOraclejet.ojrouterMod.RouterStateNs.ConfigOptions
import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  var defaultStateId: js.UndefOr[String] = js.native
  val direction: js.UndefOr[String] = js.native
  val moduleConfig: Anon_LifecycleListener = js.native
  val name: String = js.native
  @JSName("observableModuleConfig")
  val observableModuleConfig_Original: KnockoutObservable[ModuleConfigType] = js.native
  val parent: js.UndefOr[Router] = js.native
  val states: js.Array[RouterState] | Null = js.native
  def configure(option: js.Function1[/* id */ String, js.UndefOr[RouterState | Null]]): js.Any = js.native
  def configure(option: StringDictionary[ConfigOptions]): js.Any = js.native
  def createChildRouter(name: String): Router = js.native
  def createChildRouter(name: String, parentStateId: String): Router = js.native
  def currentState(): js.UndefOr[RouterState] = js.native
  def currentValue(): js.UndefOr[String] = js.native
  def dispose(): js.UndefOr[scala.Nothing] = js.native
  def getChildRouter(name: String): js.UndefOr[Router] = js.native
  def getCurrentChildRouter(): js.UndefOr[Router] = js.native
  def getState(stateId: String): js.UndefOr[RouterState] = js.native
  def go(): js.Promise[Anon_HasChanged] = js.native
  def go(stateIdPath: String): js.Promise[Anon_HasChanged] = js.native
  def go(stateIdPath: String, options: Anon_HistoryUpdate): js.Promise[Anon_HasChanged] = js.native
  def go(stateIdPath: js.Array[String]): js.Promise[Anon_HasChanged] = js.native
  def go(stateIdPath: js.Array[String], options: Anon_HistoryUpdate): js.Promise[Anon_HasChanged] = js.native
  def observableModuleConfig(): ModuleConfigType = js.native
  def observableModuleConfig(value: ModuleConfigType): Unit = js.native
  def retrieve(): js.Any = js.native
  def stateId(): String = js.native
  def stateId(param0: String): String = js.native
  def store(data: js.Object): js.UndefOr[scala.Nothing] = js.native
}

