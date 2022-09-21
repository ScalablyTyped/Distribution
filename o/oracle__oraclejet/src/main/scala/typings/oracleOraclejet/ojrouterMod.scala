package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Attached
import typings.oracleOraclejet.anon.HasChanged
import typings.oracleOraclejet.anon.HistoryUpdate
import typings.oracleOraclejet.anon.LifecycleListener
import typings.oracleOraclejet.anon.OjRouter
import typings.oracleOraclejet.ojrouterMod.RouterState.ConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojrouterMod {
  
  @JSImport("@oracle/oraclejet/ojrouter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Router
  @JSImport("@oracle/oraclejet/ojrouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  object defaults {
    
    @JSImport("@oracle/oraclejet/ojrouter", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@oracle/oraclejet/ojrouter", "defaults.baseUrl")
    @js.native
    def baseUrl: js.UndefOr[String] = js.native
    inline def baseUrl_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("@oracle/oraclejet/ojrouter", "defaults.rootInstanceName")
    @js.native
    def rootInstanceName: js.UndefOr[String] = js.native
    inline def rootInstanceName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootInstanceName")(x.asInstanceOf[js.Any])
    
    @JSImport("@oracle/oraclejet/ojrouter", "defaults.urlAdapter")
    @js.native
    def urlAdapter: js.UndefOr[urlPathAdapter | urlParamAdapter] = js.native
    inline def urlAdapter_=(x: js.UndefOr[urlPathAdapter | urlParamAdapter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlAdapter")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("@oracle/oraclejet/ojrouter", "rootInstance")
  @js.native
  val rootInstance: Router = js.native
  
  /* static member */
  inline def sync(): js.Promise[HasChanged] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.Promise[HasChanged]]
  
  /* static member */
  @JSImport("@oracle/oraclejet/ojrouter", "transitionedToState")
  @js.native
  val transitionedToState: js.Object = js.native
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("@oracle/oraclejet/ojrouter", "urlParamAdapter")
  @js.native
  open class urlParamAdapter () extends StObject
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("@oracle/oraclejet/ojrouter", "urlPathAdapter")
  @js.native
  open class urlPathAdapter () extends StObject
  
  // tslint:disable-next-line interface-over-type-literal
  trait ModuleConfigType extends StObject {
    
    var lifecycleListener: Attached
    
    var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
    
    var params: OjRouter
  }
  object ModuleConfigType {
    
    inline def apply(
      lifecycleListener: Attached,
      name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any,
      params: OjRouter
    ): ModuleConfigType = {
      val __obj = js.Dynamic.literal(lifecycleListener = lifecycleListener.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleConfigType]
    }
    
    extension [Self <: ModuleConfigType](x: Self) {
      
      inline def setLifecycleListener(value: Attached): Self = StObject.set(x, "lifecycleListener", value.asInstanceOf[js.Any])
      
      inline def setName(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: OjRouter): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Router extends StObject {
    
    def configure(option: js.Function1[/* id */ String, js.UndefOr[RouterState | Null]]): Any = js.native
    def configure(option: StringDictionary[ConfigOptions]): Any = js.native
    
    def createChildRouter(name: String): Router = js.native
    def createChildRouter(name: String, parentStateId: String): Router = js.native
    
    def currentState(): js.UndefOr[RouterState] = js.native
    
    def currentValue(): js.UndefOr[String] = js.native
    
    var defaultStateId: js.UndefOr[String] = js.native
    
    val direction: js.UndefOr[String] = js.native
    
    def dispose(): Unit = js.native
    
    def getChildRouter(name: String): js.UndefOr[Router] = js.native
    
    def getCurrentChildRouter(): js.UndefOr[Router] = js.native
    
    def getState(stateId: String): js.UndefOr[RouterState] = js.native
    
    def go(): js.Promise[HasChanged] = js.native
    def go(stateIdPath: String): js.Promise[HasChanged] = js.native
    def go(stateIdPath: String, options: HistoryUpdate): js.Promise[HasChanged] = js.native
    def go(stateIdPath: js.Array[String]): js.Promise[HasChanged] = js.native
    def go(stateIdPath: js.Array[String], options: HistoryUpdate): js.Promise[HasChanged] = js.native
    def go(stateIdPath: Unit, options: HistoryUpdate): js.Promise[HasChanged] = js.native
    
    val moduleConfig: LifecycleListener = js.native
    
    val name: String = js.native
    
    val observableModuleConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ModuleConfigType> */ Any = js.native
    
    val parent: js.UndefOr[Router] = js.native
    
    def retrieve(): Any = js.native
    
    def stateId(): String = js.native
    def stateId(param0: String): String = js.native
    
    val states: js.Array[RouterState] | Null = js.native
    
    def store(data: js.Object): Unit = js.native
  }
  
  trait RouterState extends StObject {
    
    var canEnter: js.Function0[Boolean | js.Promise[Boolean]]
    
    var canExit: js.Function0[Boolean | js.Promise[Boolean]]
    
    var enter: js.Function0[js.Promise[Unit] | Unit]
    
    var exit: js.Function0[js.Promise[Unit] | Unit]
    
    // constructor(id: string, options?: RouterState.ConfigOptions, router?: Router);
    def go(): js.Promise[HasChanged]
    
    val id: String
    
    def isCurrent(): Boolean
    
    var label: js.UndefOr[String] = js.undefined
    
    var parameters: js.Object
    
    var title: String | js.Function0[js.UndefOr[String]]
    
    var value: Any
  }
  object RouterState {
    
    inline def apply(
      canEnter: () => Boolean | js.Promise[Boolean],
      canExit: () => Boolean | js.Promise[Boolean],
      enter: () => js.Promise[Unit] | Unit,
      exit: () => js.Promise[Unit] | Unit,
      go: () => js.Promise[HasChanged],
      id: String,
      isCurrent: () => Boolean,
      parameters: js.Object,
      title: String | js.Function0[js.UndefOr[String]],
      value: Any
    ): RouterState = {
      val __obj = js.Dynamic.literal(canEnter = js.Any.fromFunction0(canEnter), canExit = js.Any.fromFunction0(canExit), enter = js.Any.fromFunction0(enter), exit = js.Any.fromFunction0(exit), go = js.Any.fromFunction0(go), id = id.asInstanceOf[js.Any], isCurrent = js.Any.fromFunction0(isCurrent), parameters = parameters.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterState]
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait ConfigOptions extends StObject {
      
      var canEnter: js.UndefOr[js.Function0[Boolean | js.Promise[Boolean]]] = js.undefined
      
      var canExit: js.UndefOr[js.Function0[Boolean | js.Promise[Boolean]]] = js.undefined
      
      var enter: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
      
      var exit: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
      
      var isDefault: js.UndefOr[Boolean] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[Any] = js.undefined
    }
    object ConfigOptions {
      
      inline def apply(): ConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConfigOptions]
      }
      
      extension [Self <: ConfigOptions](x: Self) {
        
        inline def setCanEnter(value: () => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "canEnter", js.Any.fromFunction0(value))
        
        inline def setCanEnterUndefined: Self = StObject.set(x, "canEnter", js.undefined)
        
        inline def setCanExit(value: () => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "canExit", js.Any.fromFunction0(value))
        
        inline def setCanExitUndefined: Self = StObject.set(x, "canExit", js.undefined)
        
        inline def setEnter(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "enter", js.Any.fromFunction0(value))
        
        inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
        
        inline def setExit(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
        
        inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
        
        inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
        
        inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    extension [Self <: RouterState](x: Self) {
      
      inline def setCanEnter(value: () => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "canEnter", js.Any.fromFunction0(value))
      
      inline def setCanExit(value: () => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "canExit", js.Any.fromFunction0(value))
      
      inline def setEnter(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "enter", js.Any.fromFunction0(value))
      
      inline def setExit(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
      
      inline def setGo(value: () => js.Promise[HasChanged]): Self = StObject.set(x, "go", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsCurrent(value: () => Boolean): Self = StObject.set(x, "isCurrent", js.Any.fromFunction0(value))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String | js.Function0[js.UndefOr[String]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction0(value: () => js.UndefOr[String]): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
