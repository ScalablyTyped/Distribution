package typings.oracleOraclejet

import typings.oracleOraclejet.anon.Path
import typings.oracleOraclejet.oracleOraclejetStrings.external
import typings.oracleOraclejet.oracleOraclejetStrings.internal
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcompositeMod {
  
  @JSImport("@oracle/oraclejet/ojcomposite", "getComponentMetadata")
  @js.native
  def getComponentMetadata(name: String): Metadata | Null = js.native
  
  @JSImport("@oracle/oraclejet/ojcomposite", "register")
  @js.native
  def register(name: String, descriptor: typings.oracleOraclejet.anon.Metadata): Unit = js.native
  
  @js.native
  trait Metadata extends StObject {
    
    var events: js.UndefOr[js.Object] = js.native
    
    var jetVersion: String = js.native
    
    var methods: js.UndefOr[js.Object] = js.native
    
    var name: String = js.native
    
    var properties: js.UndefOr[js.Object] = js.native
    
    var slots: js.UndefOr[js.Object] = js.native
    
    var version: String = js.native
  }
  object Metadata {
    
    @scala.inline
    def apply(jetVersion: String, name: String, version: String): Metadata = {
      val __obj = js.Dynamic.literal(jetVersion = jetVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setJetVersion(value: String): Self = StObject.set(x, "jetVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethods(value: js.Object): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setSlots(value: js.Object): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PropertyChangedContext extends StObject {
    
    var previousValue: js.Any = js.native
    
    var property: String = js.native
    
    var subproperty: js.UndefOr[Path] = js.native
    
    var updatedFrom: external | internal = js.native
    
    var value: js.Any = js.native
  }
  object PropertyChangedContext {
    
    @scala.inline
    def apply(previousValue: js.Any, property: String, updatedFrom: external | internal, value: js.Any): PropertyChangedContext = {
      val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyChangedContext]
    }
    
    @scala.inline
    implicit class PropertyChangedContextMutableBuilder[Self <: PropertyChangedContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreviousValue(value: js.Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubproperty(value: Path): Self = StObject.set(x, "subproperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubpropertyUndefined: Self = StObject.set(x, "subproperty", js.undefined)
      
      @scala.inline
      def setUpdatedFrom(value: external | internal): Self = StObject.set(x, "updatedFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewModel extends StObject {
    
    def activated(param0: ViewModelContext): js.Promise[_] | Unit = js.native
    
    def bindingsApplied(param0: ViewModelContext): Unit = js.native
    
    def connected(param0: ViewModelContext): Unit = js.native
    
    def disconnected(param0: Element): Unit = js.native
    
    def propertyChanged(param0: PropertyChangedContext): Unit = js.native
  }
  object ViewModel {
    
    @scala.inline
    def apply(
      activated: ViewModelContext => js.Promise[_] | Unit,
      bindingsApplied: ViewModelContext => Unit,
      connected: ViewModelContext => Unit,
      disconnected: Element => Unit,
      propertyChanged: PropertyChangedContext => Unit
    ): ViewModel = {
      val __obj = js.Dynamic.literal(activated = js.Any.fromFunction1(activated), bindingsApplied = js.Any.fromFunction1(bindingsApplied), connected = js.Any.fromFunction1(connected), disconnected = js.Any.fromFunction1(disconnected), propertyChanged = js.Any.fromFunction1(propertyChanged))
      __obj.asInstanceOf[ViewModel]
    }
    
    @scala.inline
    implicit class ViewModelMutableBuilder[Self <: ViewModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivated(value: ViewModelContext => js.Promise[_] | Unit): Self = StObject.set(x, "activated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBindingsApplied(value: ViewModelContext => Unit): Self = StObject.set(x, "bindingsApplied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConnected(value: ViewModelContext => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisconnected(value: Element => Unit): Self = StObject.set(x, "disconnected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPropertyChanged(value: PropertyChangedContext => Unit): Self = StObject.set(x, "propertyChanged", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ViewModelContext extends StObject {
    
    var element: Element = js.native
    
    var properties: js.Object = js.native
    
    var slotCounts: js.Object = js.native
    
    var unique: String = js.native
    
    var uniqueId: String = js.native
  }
  object ViewModelContext {
    
    @scala.inline
    def apply(element: Element, properties: js.Object, slotCounts: js.Object, unique: String, uniqueId: String): ViewModelContext = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], slotCounts = slotCounts.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewModelContext]
    }
    
    @scala.inline
    implicit class ViewModelContextMutableBuilder[Self <: ViewModelContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotCounts(value: js.Object): Self = StObject.set(x, "slotCounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnique(value: String): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    }
  }
}
