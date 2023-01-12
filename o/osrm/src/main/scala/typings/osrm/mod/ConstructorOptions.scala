package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/nodejs/api.md
  */
trait ConstructorOptions extends StObject {
  
  /**
    * The algorithm to use for routing. Can be 'CH', 'CoreCH' or 'MLD'. Default is 'CH'. Make sure you prepared the dataset with the correct toolchain.
    */
  var algorithm: js.UndefOr[AlgorithmTypes] = js.undefined
  
  /**
    * Max.number of alternatives supported in alternative routes query (default: 3).
    */
  var max_alternatives: js.UndefOr[Double] = js.undefined
  
  /**
    * Max. locations supported in distance table query (default: unlimited).
    */
  var max_locations_distance_table: js.UndefOr[Double] = js.undefined
  
  /**
    * Max. locations supported in map-matching query (default: unlimited).
    */
  var max_locations_map_matching: js.UndefOr[Double] = js.undefined
  
  /**
    * Max. locations supported in trip query (default: unlimited).
    */
  var max_locations_trip: js.UndefOr[Double] = js.undefined
  
  /**
    * Max. locations supported in viaroute query (default: unlimited).
    */
  var max_locations_viaroute: js.UndefOr[Double] = js.undefined
  
  /**
    * Max. results supported in nearest query (default: unlimited).
    */
  var max_results_nearest: js.UndefOr[Double] = js.undefined
  
  /**
    * DEPRECATED Old behaviour: Path to a file on disk to store the memory using mmap. Current behaviour: setting this
    * value is the same as setting mmap_memory: true.
    */
  var memory_file: js.UndefOr[String] = js.undefined
  
  /**
    * Map on-disk files to virtual memory addresses (mmap), rather than loading into RAM.
    */
  var mmap_memory: js.UndefOr[Boolean] = js.undefined
}
object ConstructorOptions {
  
  inline def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: AlgorithmTypes): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setMax_alternatives(value: Double): Self = StObject.set(x, "max_alternatives", value.asInstanceOf[js.Any])
    
    inline def setMax_alternativesUndefined: Self = StObject.set(x, "max_alternatives", js.undefined)
    
    inline def setMax_locations_distance_table(value: Double): Self = StObject.set(x, "max_locations_distance_table", value.asInstanceOf[js.Any])
    
    inline def setMax_locations_distance_tableUndefined: Self = StObject.set(x, "max_locations_distance_table", js.undefined)
    
    inline def setMax_locations_map_matching(value: Double): Self = StObject.set(x, "max_locations_map_matching", value.asInstanceOf[js.Any])
    
    inline def setMax_locations_map_matchingUndefined: Self = StObject.set(x, "max_locations_map_matching", js.undefined)
    
    inline def setMax_locations_trip(value: Double): Self = StObject.set(x, "max_locations_trip", value.asInstanceOf[js.Any])
    
    inline def setMax_locations_tripUndefined: Self = StObject.set(x, "max_locations_trip", js.undefined)
    
    inline def setMax_locations_viaroute(value: Double): Self = StObject.set(x, "max_locations_viaroute", value.asInstanceOf[js.Any])
    
    inline def setMax_locations_viarouteUndefined: Self = StObject.set(x, "max_locations_viaroute", js.undefined)
    
    inline def setMax_results_nearest(value: Double): Self = StObject.set(x, "max_results_nearest", value.asInstanceOf[js.Any])
    
    inline def setMax_results_nearestUndefined: Self = StObject.set(x, "max_results_nearest", js.undefined)
    
    inline def setMemory_file(value: String): Self = StObject.set(x, "memory_file", value.asInstanceOf[js.Any])
    
    inline def setMemory_fileUndefined: Self = StObject.set(x, "memory_file", js.undefined)
    
    inline def setMmap_memory(value: Boolean): Self = StObject.set(x, "mmap_memory", value.asInstanceOf[js.Any])
    
    inline def setMmap_memoryUndefined: Self = StObject.set(x, "mmap_memory", js.undefined)
  }
}
