package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered extends js.Object {
  
  var `Average difference between current eviction generation when the page was last considered`: Double = js.native
  
  var `Average on-disk page image size seen`: Double = js.native
  
  var `Clean pages currently in cache`: Double = js.native
  
  var `Current eviction generation`: Double = js.native
  
  var `Dirty pages currently in cache`: Double = js.native
  
  var `Entries in the root page`: Double = js.native
  
  var `Internal pages currently in cache`: Double = js.native
  
  var `Leaf pages currently in cache`: Double = js.native
  
  var `Maximum difference between current eviction generation when the page was last considered`: Double = js.native
  
  var `Maximum page size seen`: Double = js.native
  
  var `Minimum on-disk page image size seen`: Double = js.native
  
  var `On-disk page image sizes smaller than a single allocation unit`: Double = js.native
  
  var `Pages created in memory and never written`: Double = js.native
  
  var `Pages currently queued for eviction`: Double = js.native
  
  var `Pages that could not be queued for eviction`: Double = js.native
  
  var `Refs skipped during cache traversal`: Double = js.native
  
  var `Size of the root page`: Double = js.native
  
  var `Total number of pages currently in cache`: Double = js.native
}
object Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered {
  
  @scala.inline
  def apply(
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
  ): Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered = {
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
    __obj.asInstanceOf[Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered]
  }
  
  @scala.inline
  implicit class AveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsideredOps[Self <: Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setAverage difference between current eviction generation when the page was last considered`(value: Double): Self = this.set("Average difference between current eviction generation when the page was last considered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAverage on-disk page image size seen`(value: Double): Self = this.set("Average on-disk page image size seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setClean pages currently in cache`(value: Double): Self = this.set("Clean pages currently in cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent eviction generation`(value: Double): Self = this.set("Current eviction generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDirty pages currently in cache`(value: Double): Self = this.set("Dirty pages currently in cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEntries in the root page`(value: Double): Self = this.set("Entries in the root page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInternal pages currently in cache`(value: Double): Self = this.set("Internal pages currently in cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLeaf pages currently in cache`(value: Double): Self = this.set("Leaf pages currently in cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMaximum difference between current eviction generation when the page was last considered`(value: Double): Self = this.set("Maximum difference between current eviction generation when the page was last considered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMaximum page size seen`(value: Double): Self = this.set("Maximum page size seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMinimum on-disk page image size seen`(value: Double): Self = this.set("Minimum on-disk page image size seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOn-disk page image sizes smaller than a single allocation unit`(value: Double): Self = this.set("On-disk page image sizes smaller than a single allocation unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPages created in memory and never written`(value: Double): Self = this.set("Pages created in memory and never written", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPages currently queued for eviction`(value: Double): Self = this.set("Pages currently queued for eviction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPages that could not be queued for eviction`(value: Double): Self = this.set("Pages that could not be queued for eviction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRefs skipped during cache traversal`(value: Double): Self = this.set("Refs skipped during cache traversal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSize of the root page`(value: Double): Self = this.set("Size of the root page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTotal number of pages currently in cache`(value: Double): Self = this.set("Total number of pages currently in cache", value.asInstanceOf[js.Any])
  }
}
