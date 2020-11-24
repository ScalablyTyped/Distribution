package typings.oracleOraclejet.ojrouterMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.HasChanged
import typings.oracleOraclejet.anon.HistoryUpdate
import typings.oracleOraclejet.anon.LifecycleListener
import typings.oracleOraclejet.ojrouterMod.RouterState.ConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router extends js.Object {
  
  def configure(option: js.Function1[/* id */ String, js.UndefOr[RouterState | Null]]): js.Any = js.native
  def configure(option: StringDictionary[ConfigOptions]): js.Any = js.native
  
  def createChildRouter(name: String): Router = js.native
  def createChildRouter(name: String, parentStateId: String): Router = js.native
  
  def currentState(): js.UndefOr[RouterState] = js.native
  
  def currentValue(): js.UndefOr[String] = js.native
  
  var defaultStateId: js.UndefOr[String] = js.native
  
  val direction: js.UndefOr[String] = js.native
  
  def dispose(): js.UndefOr[scala.Nothing] = js.native
  
  def getChildRouter(name: String): js.UndefOr[Router] = js.native
  
  def getCurrentChildRouter(): js.UndefOr[Router] = js.native
  
  def getState(stateId: String): js.UndefOr[RouterState] = js.native
  
  def go(): js.Promise[HasChanged] = js.native
  def go(stateIdPath: js.UndefOr[scala.Nothing], options: HistoryUpdate): js.Promise[HasChanged] = js.native
  def go(stateIdPath: String): js.Promise[HasChanged] = js.native
  def go(stateIdPath: String, options: HistoryUpdate): js.Promise[HasChanged] = js.native
  def go(stateIdPath: js.Array[String]): js.Promise[HasChanged] = js.native
  def go(stateIdPath: js.Array[String], options: HistoryUpdate): js.Promise[HasChanged] = js.native
  
  val moduleConfig: LifecycleListener = js.native
  
  val name: String = js.native
  
  val observableModuleConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ModuleConfigType> */ js.Any = js.native
  
  val parent: js.UndefOr[Router] = js.native
  
  def retrieve(): js.Any = js.native
  
  def stateId(): String = js.native
  def stateId(param0: String): String = js.native
  
  val states: js.Array[RouterState] | Null = js.native
  
  def store(data: js.Object): js.UndefOr[scala.Nothing] = js.native
}
