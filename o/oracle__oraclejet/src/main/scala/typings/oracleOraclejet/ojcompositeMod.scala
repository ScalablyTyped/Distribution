package typings.oracleOraclejet

import typings.oracleOraclejet.anon.Path
import typings.oracleOraclejet.oracleOraclejetStrings.external
import typings.oracleOraclejet.oracleOraclejetStrings.internal
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcompositeMod {
  
  @JSImport("@oracle/oraclejet/ojcomposite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getComponentMetadata(name: String): Metadata | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentMetadata")(name.asInstanceOf[js.Any]).asInstanceOf[Metadata | Null]
  
  inline def register(name: String, descriptor: typings.oracleOraclejet.anon.Metadata): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(name.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Metadata extends StObject {
    
    var events: js.UndefOr[js.Object] = js.undefined
    
    var jetVersion: String
    
    var methods: js.UndefOr[js.Object] = js.undefined
    
    var name: String
    
    var properties: js.UndefOr[js.Object] = js.undefined
    
    var slots: js.UndefOr[js.Object] = js.undefined
    
    var version: String
  }
  object Metadata {
    
    inline def apply(jetVersion: String, name: String, version: String): Metadata = {
      val __obj = js.Dynamic.literal(jetVersion = jetVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setJetVersion(value: String): Self = StObject.set(x, "jetVersion", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: js.Object): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setSlots(value: js.Object): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropertyChangedContext extends StObject {
    
    var previousValue: js.Any
    
    var property: String
    
    var subproperty: js.UndefOr[Path] = js.undefined
    
    var updatedFrom: external | internal
    
    var value: js.Any
  }
  object PropertyChangedContext {
    
    inline def apply(previousValue: js.Any, property: String, updatedFrom: external | internal, value: js.Any): PropertyChangedContext = {
      val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyChangedContext]
    }
    
    extension [Self <: PropertyChangedContext](x: Self) {
      
      inline def setPreviousValue(value: js.Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setSubproperty(value: Path): Self = StObject.set(x, "subproperty", value.asInstanceOf[js.Any])
      
      inline def setSubpropertyUndefined: Self = StObject.set(x, "subproperty", js.undefined)
      
      inline def setUpdatedFrom(value: external | internal): Self = StObject.set(x, "updatedFrom", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewModel extends StObject {
    
    def activated(param0: ViewModelContext): js.Promise[js.Any] | Unit
    
    def bindingsApplied(param0: ViewModelContext): Unit
    
    def connected(param0: ViewModelContext): Unit
    
    def disconnected(param0: Element): Unit
    
    def propertyChanged(param0: PropertyChangedContext): Unit
  }
  object ViewModel {
    
    inline def apply(
      activated: ViewModelContext => js.Promise[js.Any] | Unit,
      bindingsApplied: ViewModelContext => Unit,
      connected: ViewModelContext => Unit,
      disconnected: Element => Unit,
      propertyChanged: PropertyChangedContext => Unit
    ): ViewModel = {
      val __obj = js.Dynamic.literal(activated = js.Any.fromFunction1(activated), bindingsApplied = js.Any.fromFunction1(bindingsApplied), connected = js.Any.fromFunction1(connected), disconnected = js.Any.fromFunction1(disconnected), propertyChanged = js.Any.fromFunction1(propertyChanged))
      __obj.asInstanceOf[ViewModel]
    }
    
    extension [Self <: ViewModel](x: Self) {
      
      inline def setActivated(value: ViewModelContext => js.Promise[js.Any] | Unit): Self = StObject.set(x, "activated", js.Any.fromFunction1(value))
      
      inline def setBindingsApplied(value: ViewModelContext => Unit): Self = StObject.set(x, "bindingsApplied", js.Any.fromFunction1(value))
      
      inline def setConnected(value: ViewModelContext => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction1(value))
      
      inline def setDisconnected(value: Element => Unit): Self = StObject.set(x, "disconnected", js.Any.fromFunction1(value))
      
      inline def setPropertyChanged(value: PropertyChangedContext => Unit): Self = StObject.set(x, "propertyChanged", js.Any.fromFunction1(value))
    }
  }
  
  trait ViewModelContext extends StObject {
    
    var element: Element
    
    var properties: js.Object
    
    var slotCounts: js.Object
    
    var unique: String
    
    var uniqueId: String
  }
  object ViewModelContext {
    
    inline def apply(element: Element, properties: js.Object, slotCounts: js.Object, unique: String, uniqueId: String): ViewModelContext = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], slotCounts = slotCounts.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewModelContext]
    }
    
    extension [Self <: ViewModelContext](x: Self) {
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSlotCounts(value: js.Object): Self = StObject.set(x, "slotCounts", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: String): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    }
  }
}
