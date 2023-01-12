package typings.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  Average difference between current eviction generation when the page was last considered :number,   Average on-disk page image size seen :number,   Clean pages currently in cache :number,   Current eviction generation :number,   Dirty pages currently in cache :number,   Entries in the root page :number,   Internal pages currently in cache :number,   Leaf pages currently in cache :number,   Maximum difference between current eviction generation when the page was last considered :number,   Maximum page size seen :number,   Minimum on-disk page image size seen :number,   On-disk page image sizes smaller than a single allocation unit :number,   Pages created in memory and never written :number,   Pages currently queued for eviction :number,   Pages that could not be queued for eviction :number,   Refs skipped during cache traversal :number,   Size of the root page :number,   Total number of pages currently in cache :number} & bson.bson.Document */
trait Averagedifferencebetweenc
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var `Average difference between current eviction generation when the page was last considered`: Double
  
  var `Average on-disk page image size seen`: Double
  
  var `Clean pages currently in cache`: Double
  
  var `Current eviction generation`: Double
  
  var `Dirty pages currently in cache`: Double
  
  var `Entries in the root page`: Double
  
  var `Internal pages currently in cache`: Double
  
  var `Leaf pages currently in cache`: Double
  
  var `Maximum difference between current eviction generation when the page was last considered`: Double
  
  var `Maximum page size seen`: Double
  
  var `Minimum on-disk page image size seen`: Double
  
  var `On-disk page image sizes smaller than a single allocation unit`: Double
  
  var `Pages created in memory and never written`: Double
  
  var `Pages currently queued for eviction`: Double
  
  var `Pages that could not be queued for eviction`: Double
  
  var `Refs skipped during cache traversal`: Double
  
  var `Size of the root page`: Double
  
  var `Total number of pages currently in cache`: Double
}
object Averagedifferencebetweenc {
  
  inline def apply(
    `Average difference between current eviction generation when the page was last considered`: Double,
    `Average on-disk page image size seen`: Double,
    `Clean pages currently in cache`: Double,
    `Current eviction generation`: Double,
    `Dirty pages currently in cache`: Double,
    `Entries in the root page`: Double,
    `Internal pages currently in cache`: Double,
    `Leaf pages currently in cache`: Double,
    `Maximum difference between current eviction generation when the page was last considered`: Double,
    `Maximum page size seen`: Double,
    `Minimum on-disk page image size seen`: Double,
    `On-disk page image sizes smaller than a single allocation unit`: Double,
    `Pages created in memory and never written`: Double,
    `Pages currently queued for eviction`: Double,
    `Pages that could not be queued for eviction`: Double,
    `Refs skipped during cache traversal`: Double,
    `Size of the root page`: Double,
    `Total number of pages currently in cache`: Double
  ): Averagedifferencebetweenc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Average difference between current eviction generation when the page was last considered")((`Average difference between current eviction generation when the page was last considered`).asInstanceOf[js.Any])
    __obj.updateDynamic("Average on-disk page image size seen")((`Average on-disk page image size seen`).asInstanceOf[js.Any])
    __obj.updateDynamic("Clean pages currently in cache")((`Clean pages currently in cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("Current eviction generation")((`Current eviction generation`).asInstanceOf[js.Any])
    __obj.updateDynamic("Dirty pages currently in cache")((`Dirty pages currently in cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("Entries in the root page")((`Entries in the root page`).asInstanceOf[js.Any])
    __obj.updateDynamic("Internal pages currently in cache")((`Internal pages currently in cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("Leaf pages currently in cache")((`Leaf pages currently in cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("Maximum difference between current eviction generation when the page was last considered")((`Maximum difference between current eviction generation when the page was last considered`).asInstanceOf[js.Any])
    __obj.updateDynamic("Maximum page size seen")((`Maximum page size seen`).asInstanceOf[js.Any])
    __obj.updateDynamic("Minimum on-disk page image size seen")((`Minimum on-disk page image size seen`).asInstanceOf[js.Any])
    __obj.updateDynamic("On-disk page image sizes smaller than a single allocation unit")((`On-disk page image sizes smaller than a single allocation unit`).asInstanceOf[js.Any])
    __obj.updateDynamic("Pages created in memory and never written")((`Pages created in memory and never written`).asInstanceOf[js.Any])
    __obj.updateDynamic("Pages currently queued for eviction")((`Pages currently queued for eviction`).asInstanceOf[js.Any])
    __obj.updateDynamic("Pages that could not be queued for eviction")((`Pages that could not be queued for eviction`).asInstanceOf[js.Any])
    __obj.updateDynamic("Refs skipped during cache traversal")((`Refs skipped during cache traversal`).asInstanceOf[js.Any])
    __obj.updateDynamic("Size of the root page")((`Size of the root page`).asInstanceOf[js.Any])
    __obj.updateDynamic("Total number of pages currently in cache")((`Total number of pages currently in cache`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Averagedifferencebetweenc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Averagedifferencebetweenc] (val x: Self) extends AnyVal {
    
    inline def `setAverage difference between current eviction generation when the page was last considered`(value: Double): Self = StObject.set(x, "Average difference between current eviction generation when the page was last considered", value.asInstanceOf[js.Any])
    
    inline def `setAverage on-disk page image size seen`(value: Double): Self = StObject.set(x, "Average on-disk page image size seen", value.asInstanceOf[js.Any])
    
    inline def `setClean pages currently in cache`(value: Double): Self = StObject.set(x, "Clean pages currently in cache", value.asInstanceOf[js.Any])
    
    inline def `setCurrent eviction generation`(value: Double): Self = StObject.set(x, "Current eviction generation", value.asInstanceOf[js.Any])
    
    inline def `setDirty pages currently in cache`(value: Double): Self = StObject.set(x, "Dirty pages currently in cache", value.asInstanceOf[js.Any])
    
    inline def `setEntries in the root page`(value: Double): Self = StObject.set(x, "Entries in the root page", value.asInstanceOf[js.Any])
    
    inline def `setInternal pages currently in cache`(value: Double): Self = StObject.set(x, "Internal pages currently in cache", value.asInstanceOf[js.Any])
    
    inline def `setLeaf pages currently in cache`(value: Double): Self = StObject.set(x, "Leaf pages currently in cache", value.asInstanceOf[js.Any])
    
    inline def `setMaximum difference between current eviction generation when the page was last considered`(value: Double): Self = StObject.set(x, "Maximum difference between current eviction generation when the page was last considered", value.asInstanceOf[js.Any])
    
    inline def `setMaximum page size seen`(value: Double): Self = StObject.set(x, "Maximum page size seen", value.asInstanceOf[js.Any])
    
    inline def `setMinimum on-disk page image size seen`(value: Double): Self = StObject.set(x, "Minimum on-disk page image size seen", value.asInstanceOf[js.Any])
    
    inline def `setOn-disk page image sizes smaller than a single allocation unit`(value: Double): Self = StObject.set(x, "On-disk page image sizes smaller than a single allocation unit", value.asInstanceOf[js.Any])
    
    inline def `setPages created in memory and never written`(value: Double): Self = StObject.set(x, "Pages created in memory and never written", value.asInstanceOf[js.Any])
    
    inline def `setPages currently queued for eviction`(value: Double): Self = StObject.set(x, "Pages currently queued for eviction", value.asInstanceOf[js.Any])
    
    inline def `setPages that could not be queued for eviction`(value: Double): Self = StObject.set(x, "Pages that could not be queued for eviction", value.asInstanceOf[js.Any])
    
    inline def `setRefs skipped during cache traversal`(value: Double): Self = StObject.set(x, "Refs skipped during cache traversal", value.asInstanceOf[js.Any])
    
    inline def `setSize of the root page`(value: Double): Self = StObject.set(x, "Size of the root page", value.asInstanceOf[js.Any])
    
    inline def `setTotal number of pages currently in cache`(value: Double): Self = StObject.set(x, "Total number of pages currently in cache", value.asInstanceOf[js.Any])
  }
}
