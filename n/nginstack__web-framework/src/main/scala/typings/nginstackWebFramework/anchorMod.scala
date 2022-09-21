package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorMod {
  
  inline def apply(name: Any, nextInteractionNameOrFunction: Any, nextProcessKey: Any, createNewTab: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], nextInteractionNameOrFunction.asInstanceOf[js.Any], nextProcessKey.asInstanceOf[js.Any], createNewTab.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/anchor/Anchor", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Anchor {
    def this(name: Any, nextInteractionNameOrFunction: Any, nextProcessKey: Any, createNewTab: Any) = this()
    
    /* private */ /* CompleteClass */
    var _changedProperties: Any = js.native
    
    /* private */ /* CompleteClass */
    var _clearChangedProperties: Any = js.native
    
    /* private */ /* CompleteClass */
    var _prepare: Any = js.native
    
    /* private */ /* CompleteClass */
    var accessible: Any = js.native
    
    /* CompleteClass */
    override def assign(obj: Anchor): Unit = js.native
    
    /* private */ /* CompleteClass */
    var changed: Any = js.native
    
    /* private */ /* CompleteClass */
    var collection: Any = js.native
    
    /* CompleteClass */
    override def config(nextInteractionNameOrFunction: Any, nextProcessKey: Any, createNewTab: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var convertParametersToParams: Any = js.native
    
    /* CompleteClass */
    var createNewTab: Boolean = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* protected */ /* CompleteClass */
    override def forcingChanges_(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var getChanges: Any = js.native
    
    /* private */ /* CompleteClass */
    var getParameters: Any = js.native
    
    /* private */ /* CompleteClass */
    var getParametersNames: Any = js.native
    
    /* protected */ /* CompleteClass */
    override def getParamsInfo(parametersValues: Any): js.Array[Any] = js.native
    
    /* private */ /* CompleteClass */
    var getProcessedParameters: Any = js.native
    
    /* private */ /* CompleteClass */
    var hasOnClickEvent: Any = js.native
    
    /* CompleteClass */
    var hint: String = js.native
    
    /* private */ /* CompleteClass */
    var identifierName: Any = js.native
    
    /* private */ /* CompleteClass */
    var index: Any = js.native
    
    /* CompleteClass */
    var label: String = js.native
    
    /* private */ /* CompleteClass */
    var last_parameters: Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var nextInteractionName: String = js.native
    
    /* CompleteClass */
    var nextProcessId: String = js.native
    
    /* CompleteClass */
    var nextProcessKey: Double = js.native
    
    /* CompleteClass */
    var onClick: typings.nginstackEngine.legacyEventMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var parameters_ : Any = js.native
    
    /* CompleteClass */
    var parent: Any = js.native
    
    /* CompleteClass */
    var permissionKeyWord: String = js.native
    
    /* private */ /* CompleteClass */
    var prepared: Any = js.native
    
    /* CompleteClass */
    var process: Any = js.native
    
    /* protected */ /* CompleteClass */
    var propertiesToSync_ : js.Array[String] = js.native
    
    /* private */ /* CompleteClass */
    var resetProperties: Any = js.native
    
    /* private */ /* CompleteClass */
    var resettingProperties_ : Any = js.native
    
    /* protected */ /* CompleteClass */
    override def setChangedProperty(id: String, syncValue: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var setPropertiesDefaultValues: Any = js.native
    
    /* private */ /* CompleteClass */
    @JSName("toString")
    var toString_FAnchor: Any = js.native
    
    /* CompleteClass */
    var validateLastInteraction: Boolean = js.native
  }
  @JSImport("@nginstack/web-framework/lib/anchor/Anchor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/anchor/Anchor", "createProcess")
  @js.native
  val createProcess: Any = js.native
  
  trait Anchor extends StObject {
    
    /* private */ var _changedProperties: Any
    
    /* private */ var _clearChangedProperties: Any
    
    /* private */ var _prepare: Any
    
    /* private */ var accessible: Any
    
    def assign(obj: Anchor): Unit
    
    /* private */ var changed: Any
    
    /* private */ var collection: Any
    
    def config(nextInteractionNameOrFunction: Any, nextProcessKey: Any, createNewTab: Any): Unit
    
    /* private */ var convertParametersToParams: Any
    
    var createNewTab: Boolean
    
    var enabled: Boolean
    
    /* protected */ def forcingChanges_(): Boolean
    
    /* private */ var getChanges: Any
    
    /* private */ var getParameters: Any
    
    /* private */ var getParametersNames: Any
    
    /* protected */ def getParamsInfo(parametersValues: Any): js.Array[Any]
    
    /* private */ var getProcessedParameters: Any
    
    /* private */ var hasOnClickEvent: Any
    
    var hint: String
    
    /* private */ var identifierName: Any
    
    /* private */ var index: Any
    
    var label: String
    
    /* private */ var last_parameters: Any
    
    /* private */ var logger_ : Any
    
    var name: String
    
    var nextInteractionName: String
    
    var nextProcessId: String
    
    var nextProcessKey: Double
    
    var onClick: typings.nginstackEngine.legacyEventMod.^
    
    /* private */ var parameters_ : Any
    
    var parent: Any
    
    var permissionKeyWord: String
    
    /* private */ var prepared: Any
    
    var process: Any
    
    /* protected */ var propertiesToSync_ : js.Array[String]
    
    /* private */ var resetProperties: Any
    
    /* private */ var resettingProperties_ : Any
    
    /* protected */ def setChangedProperty(id: String, syncValue: Any): Unit
    
    /* private */ var setPropertiesDefaultValues: Any
    
    /* private */ @JSName("toString")
    var toString_FAnchor: Any
    
    var validateLastInteraction: Boolean
  }
  object Anchor {
    
    inline def apply(
      _changedProperties: Any,
      _clearChangedProperties: Any,
      _prepare: Any,
      accessible: Any,
      assign: Anchor => Unit,
      changed: Any,
      collection: Any,
      config: (Any, Any, Any) => Unit,
      convertParametersToParams: Any,
      createNewTab: Boolean,
      enabled: Boolean,
      forcingChanges_ : () => Boolean,
      getChanges: Any,
      getParameters: Any,
      getParametersNames: Any,
      getParamsInfo: Any => js.Array[Any],
      getProcessedParameters: Any,
      hasOnClickEvent: Any,
      hint: String,
      identifierName: Any,
      index: Any,
      label: String,
      last_parameters: Any,
      logger_ : Any,
      name: String,
      nextInteractionName: String,
      nextProcessId: String,
      nextProcessKey: Double,
      onClick: typings.nginstackEngine.legacyEventMod.^,
      parameters_ : Any,
      parent: Any,
      permissionKeyWord: String,
      prepared: Any,
      process: Any,
      propertiesToSync_ : js.Array[String],
      resetProperties: Any,
      resettingProperties_ : Any,
      setChangedProperty: (String, Any) => Unit,
      setPropertiesDefaultValues: Any,
      toString_ : Any,
      validateLastInteraction: Boolean
    ): Anchor = {
      val __obj = js.Dynamic.literal(_changedProperties = _changedProperties.asInstanceOf[js.Any], _clearChangedProperties = _clearChangedProperties.asInstanceOf[js.Any], _prepare = _prepare.asInstanceOf[js.Any], accessible = accessible.asInstanceOf[js.Any], assign = js.Any.fromFunction1(assign), changed = changed.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], config = js.Any.fromFunction3(config), convertParametersToParams = convertParametersToParams.asInstanceOf[js.Any], createNewTab = createNewTab.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], forcingChanges_ = js.Any.fromFunction0(forcingChanges_), getChanges = getChanges.asInstanceOf[js.Any], getParameters = getParameters.asInstanceOf[js.Any], getParametersNames = getParametersNames.asInstanceOf[js.Any], getParamsInfo = js.Any.fromFunction1(getParamsInfo), getProcessedParameters = getProcessedParameters.asInstanceOf[js.Any], hasOnClickEvent = hasOnClickEvent.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], identifierName = identifierName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], last_parameters = last_parameters.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextInteractionName = nextInteractionName.asInstanceOf[js.Any], nextProcessId = nextProcessId.asInstanceOf[js.Any], nextProcessKey = nextProcessKey.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], parameters_ = parameters_.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permissionKeyWord = permissionKeyWord.asInstanceOf[js.Any], prepared = prepared.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], propertiesToSync_ = propertiesToSync_.asInstanceOf[js.Any], resetProperties = resetProperties.asInstanceOf[js.Any], resettingProperties_ = resettingProperties_.asInstanceOf[js.Any], setChangedProperty = js.Any.fromFunction2(setChangedProperty), setPropertiesDefaultValues = setPropertiesDefaultValues.asInstanceOf[js.Any], validateLastInteraction = validateLastInteraction.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Anchor]
    }
    
    extension [Self <: Anchor](x: Self) {
      
      inline def setAccessible(value: Any): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAssign(value: Anchor => Unit): Self = StObject.set(x, "assign", js.Any.fromFunction1(value))
      
      inline def setChanged(value: Any): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setCollection(value: Any): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "config", js.Any.fromFunction3(value))
      
      inline def setConvertParametersToParams(value: Any): Self = StObject.set(x, "convertParametersToParams", value.asInstanceOf[js.Any])
      
      inline def setCreateNewTab(value: Boolean): Self = StObject.set(x, "createNewTab", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setForcingChanges_(value: () => Boolean): Self = StObject.set(x, "forcingChanges_", js.Any.fromFunction0(value))
      
      inline def setGetChanges(value: Any): Self = StObject.set(x, "getChanges", value.asInstanceOf[js.Any])
      
      inline def setGetParameters(value: Any): Self = StObject.set(x, "getParameters", value.asInstanceOf[js.Any])
      
      inline def setGetParametersNames(value: Any): Self = StObject.set(x, "getParametersNames", value.asInstanceOf[js.Any])
      
      inline def setGetParamsInfo(value: Any => js.Array[Any]): Self = StObject.set(x, "getParamsInfo", js.Any.fromFunction1(value))
      
      inline def setGetProcessedParameters(value: Any): Self = StObject.set(x, "getProcessedParameters", value.asInstanceOf[js.Any])
      
      inline def setHasOnClickEvent(value: Any): Self = StObject.set(x, "hasOnClickEvent", value.asInstanceOf[js.Any])
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setIdentifierName(value: Any): Self = StObject.set(x, "identifierName", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLast_parameters(value: Any): Self = StObject.set(x, "last_parameters", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNextInteractionName(value: String): Self = StObject.set(x, "nextInteractionName", value.asInstanceOf[js.Any])
      
      inline def setNextProcessId(value: String): Self = StObject.set(x, "nextProcessId", value.asInstanceOf[js.Any])
      
      inline def setNextProcessKey(value: Double): Self = StObject.set(x, "nextProcessKey", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: typings.nginstackEngine.legacyEventMod.^): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setParameters_(value: Any): Self = StObject.set(x, "parameters_", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPermissionKeyWord(value: String): Self = StObject.set(x, "permissionKeyWord", value.asInstanceOf[js.Any])
      
      inline def setPrepared(value: Any): Self = StObject.set(x, "prepared", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: Any): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setPropertiesToSync_(value: js.Array[String]): Self = StObject.set(x, "propertiesToSync_", value.asInstanceOf[js.Any])
      
      inline def setPropertiesToSync_Varargs(value: String*): Self = StObject.set(x, "propertiesToSync_", js.Array(value*))
      
      inline def setResetProperties(value: Any): Self = StObject.set(x, "resetProperties", value.asInstanceOf[js.Any])
      
      inline def setResettingProperties_(value: Any): Self = StObject.set(x, "resettingProperties_", value.asInstanceOf[js.Any])
      
      inline def setSetChangedProperty(value: (String, Any) => Unit): Self = StObject.set(x, "setChangedProperty", js.Any.fromFunction2(value))
      
      inline def setSetPropertiesDefaultValues(value: Any): Self = StObject.set(x, "setPropertiesDefaultValues", value.asInstanceOf[js.Any])
      
      inline def setToString_(value: Any): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setValidateLastInteraction(value: Boolean): Self = StObject.set(x, "validateLastInteraction", value.asInstanceOf[js.Any])
      
      inline def set_changedProperties(value: Any): Self = StObject.set(x, "_changedProperties", value.asInstanceOf[js.Any])
      
      inline def set_clearChangedProperties(value: Any): Self = StObject.set(x, "_clearChangedProperties", value.asInstanceOf[js.Any])
      
      inline def set_prepare(value: Any): Self = StObject.set(x, "_prepare", value.asInstanceOf[js.Any])
    }
  }
}
