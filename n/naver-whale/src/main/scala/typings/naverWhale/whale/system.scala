package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object system {
  
  ////////////////////
  // System CPU
  ////////////////////
  /**
    * Use the system.cpu API to query CPU metadata.
    * Permissions: "system.cpu"
    * @since Chrome 32.
    */
  object cpu {
    
    trait CpuInfo extends StObject {
      
      /** The architecture name of the processors. */
      var archName: String
      
      /**
        * A set of feature codes indicating some of the processor's capabilities.
        * The currently supported codes are "mmx", "sse", "sse2", "sse3", "ssse3", "sse4_1", "sse4_2", and "avx".
        */
      var features: js.Array[String]
      
      /** The model name of the processors. */
      var modelName: String
      
      /** The number of logical processors. */
      var numOfProcessors: Double
      
      /** Information about each logical processor. */
      var processors: js.Array[typings.chrome.chrome.system.cpu.ProcessorInfo]
    }
    object CpuInfo {
      
      inline def apply(
        archName: String,
        features: js.Array[String],
        modelName: String,
        numOfProcessors: Double,
        processors: js.Array[typings.chrome.chrome.system.cpu.ProcessorInfo]
      ): CpuInfo = {
        val __obj = js.Dynamic.literal(archName = archName.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], numOfProcessors = numOfProcessors.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any])
        __obj.asInstanceOf[CpuInfo]
      }
      
      extension [Self <: CpuInfo](x: Self) {
        
        inline def setArchName(value: String): Self = StObject.set(x, "archName", value.asInstanceOf[js.Any])
        
        inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
        
        inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
        
        inline def setNumOfProcessors(value: Double): Self = StObject.set(x, "numOfProcessors", value.asInstanceOf[js.Any])
        
        inline def setProcessors(value: js.Array[typings.chrome.chrome.system.cpu.ProcessorInfo]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
        
        inline def setProcessorsVarargs(value: typings.chrome.chrome.system.cpu.ProcessorInfo*): Self = StObject.set(x, "processors", js.Array(value :_*))
      }
    }
    
    trait ProcessorInfo extends StObject {
      
      /** Cumulative usage info for this logical processor. */
      var usage: typings.chrome.chrome.system.cpu.ProcessorUsage
    }
    object ProcessorInfo {
      
      inline def apply(usage: typings.chrome.chrome.system.cpu.ProcessorUsage): ProcessorInfo = {
        val __obj = js.Dynamic.literal(usage = usage.asInstanceOf[js.Any])
        __obj.asInstanceOf[ProcessorInfo]
      }
      
      extension [Self <: ProcessorInfo](x: Self) {
        
        inline def setUsage(value: typings.chrome.chrome.system.cpu.ProcessorUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      }
    }
    
    trait ProcessorUsage extends StObject {
      
      /** The cumulative time spent idle by this processor. */
      var idle: Double
      
      /** The cumulative time used by kernel programs on this processor. */
      var kernel: Double
      
      /** The total cumulative time for this processor. This value is equal to user + kernel + idle. */
      var total: Double
      
      /** The cumulative time used by userspace programs on this processor. */
      var user: Double
    }
    object ProcessorUsage {
      
      inline def apply(idle: Double, kernel: Double, total: Double, user: Double): ProcessorUsage = {
        val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
        __obj.asInstanceOf[ProcessorUsage]
      }
      
      extension [Self <: ProcessorUsage](x: Self) {
        
        inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
        
        inline def setKernel(value: Double): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
        
        inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
        
        inline def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      }
    }
  }
  
  ////////////////////
  // System Memory
  ////////////////////
  /**
    * The chrome.system.memory API.
    * Permissions:  "system.memory"
    * @since Chrome 32.
    */
  object memory {
    
    trait MemoryInfo extends StObject {
      
      /** The amount of available capacity, in bytes. */
      var availableCapacity: Double
      
      /** The total amount of physical memory capacity, in bytes. */
      var capacity: Double
    }
    object MemoryInfo {
      
      inline def apply(availableCapacity: Double, capacity: Double): MemoryInfo = {
        val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any])
        __obj.asInstanceOf[MemoryInfo]
      }
      
      extension [Self <: MemoryInfo](x: Self) {
        
        inline def setAvailableCapacity(value: Double): Self = StObject.set(x, "availableCapacity", value.asInstanceOf[js.Any])
        
        inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      }
    }
  }
  
  ////////////////////
  // System Storage
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * Permissions:  "system.storage"
    * @since Chrome 30.
    */
  object storage {
    
    trait StorageCapacityInfo extends StObject {
      
      /** The available capacity of the storage device, in bytes. */
      var availableCapacity: Double
      
      /** A copied |id| of getAvailableCapacity function parameter |id|. */
      var id: String
    }
    object StorageCapacityInfo {
      
      inline def apply(availableCapacity: Double, id: String): StorageCapacityInfo = {
        val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[StorageCapacityInfo]
      }
      
      extension [Self <: StorageCapacityInfo](x: Self) {
        
        inline def setAvailableCapacity(value: Double): Self = StObject.set(x, "availableCapacity", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    trait StorageUnitInfo extends StObject {
      
      /** The total amount of the storage space, in bytes. */
      var capacity: Double
      
      /** The transient ID that uniquely identifies the storage device. This ID will be persistent within the same run of a single application. It will not be a persistent identifier between different runs of an application, or between different applications. */
      var id: String
      
      /** The name of the storage unit. */
      var name: String
      
      /**
        * The media type of the storage unit.
        * fixed: The storage has fixed media, e.g. hard disk or SSD.
        * removable: The storage is removable, e.g. USB flash drive.
        * unknown: The storage type is unknown.
        */
      var `type`: String
    }
    object StorageUnitInfo {
      
      inline def apply(capacity: Double, id: String, name: String, `type`: String): StorageUnitInfo = {
        val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[StorageUnitInfo]
      }
      
      extension [Self <: StorageUnitInfo](x: Self) {
        
        inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    type SystemStorageAttachedEvent = Event[
        js.Function1[/* info */ typings.chrome.chrome.system.storage.StorageUnitInfo, Unit]
      ]
    
    type SystemStorageDetachedEvent = Event[js.Function1[/* id */ String, Unit]]
  }
}
