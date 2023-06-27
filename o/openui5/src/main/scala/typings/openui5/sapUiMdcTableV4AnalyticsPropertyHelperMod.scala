package typings.openui5

import typings.openui5.anon.ContextDefiningProperties
import typings.openui5.anon.TechnicallyGroupable
import typings.openui5.sapUiMdcTablePropertyHelperMod.PropertyInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcTableV4AnalyticsPropertyHelperMod {
  
  trait TablePropertyInfo
    extends StObject
       with PropertyInfo {
    
    /**
      * Defines whether a property is aggregatable.
      */
    var aggregatable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide an object, it can be empty, if there is a `CustomAggregate` whose `Qualifier` is equal to the
      * name of this property. This enables the option to show totals if `aggregatable` is `true`.
      */
    var customAggregate: js.UndefOr[ContextDefiningProperties] = js.undefined
    
    /**
      * Contains model-specific information.
      */
    var `extension`: js.UndefOr[TechnicallyGroupable] = js.undefined
    
    /**
      * If `aggregatable` is set to `false` to exclude it from aggregate personalization on the UI, the UI still
      * needs to know that this property is aggregatable for data requests.
      */
    var technicallyAggregatable: js.UndefOr[Boolean] = js.undefined
  }
  object TablePropertyInfo {
    
    inline def apply(dataType: String, label: String, name: String): TablePropertyInfo = {
      val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablePropertyInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TablePropertyInfo] (val x: Self) extends AnyVal {
      
      inline def setAggregatable(value: Boolean): Self = StObject.set(x, "aggregatable", value.asInstanceOf[js.Any])
      
      inline def setAggregatableUndefined: Self = StObject.set(x, "aggregatable", js.undefined)
      
      inline def setCustomAggregate(value: ContextDefiningProperties): Self = StObject.set(x, "customAggregate", value.asInstanceOf[js.Any])
      
      inline def setCustomAggregateUndefined: Self = StObject.set(x, "customAggregate", js.undefined)
      
      inline def setExtension(value: TechnicallyGroupable): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setTechnicallyAggregatable(value: Boolean): Self = StObject.set(x, "technicallyAggregatable", value.asInstanceOf[js.Any])
      
      inline def setTechnicallyAggregatableUndefined: Self = StObject.set(x, "technicallyAggregatable", js.undefined)
    }
  }
}
