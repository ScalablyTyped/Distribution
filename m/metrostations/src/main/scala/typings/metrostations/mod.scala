package typings.metrostations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metrostations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("metrostations", "Beijing")
  @js.native
  def Beijing: MetroStations = js.native
  inline def Beijing_=(x: MetroStations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Beijing")(x.asInstanceOf[js.Any])
  
  @JSImport("metrostations", "Moscow")
  @js.native
  def Moscow: MetroStations = js.native
  inline def Moscow_=(x: MetroStations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Moscow")(x.asInstanceOf[js.Any])
  
  @JSImport("metrostations", "SaintPetersburg")
  @js.native
  def SaintPetersburg: MetroStations = js.native
  inline def SaintPetersburg_=(x: MetroStations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SaintPetersburg")(x.asInstanceOf[js.Any])
  
  @JSImport("metrostations", "Tokyo")
  @js.native
  def Tokyo: MetroStations = js.native
  inline def Tokyo_=(x: MetroStations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tokyo")(x.asInstanceOf[js.Any])
  
  trait Line extends StObject {
    
    var color: String
    
    var id: Double
    
    var intl_name: String
    
    var lineTransfers: js.Array[Double]
    
    var local_name: String
  }
  object Line {
    
    inline def apply(color: String, id: Double, intl_name: String, lineTransfers: js.Array[Double], local_name: String): Line = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intl_name = intl_name.asInstanceOf[js.Any], lineTransfers = lineTransfers.asInstanceOf[js.Any], local_name = local_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Line]
    }
    
    extension [Self <: Line](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIntl_name(value: String): Self = StObject.set(x, "intl_name", value.asInstanceOf[js.Any])
      
      inline def setLineTransfers(value: js.Array[Double]): Self = StObject.set(x, "lineTransfers", value.asInstanceOf[js.Any])
      
      inline def setLineTransfersVarargs(value: Double*): Self = StObject.set(x, "lineTransfers", js.Array(value*))
      
      inline def setLocal_name(value: String): Self = StObject.set(x, "local_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetroStations extends StObject {
    
    val lines: js.Array[Line]
    
    val stations: js.Array[Station]
  }
  object MetroStations {
    
    inline def apply(lines: js.Array[Line], stations: js.Array[Station]): MetroStations = {
      val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], stations = stations.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetroStations]
    }
    
    extension [Self <: MetroStations](x: Self) {
      
      inline def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value*))
      
      inline def setStations(value: js.Array[Station]): Self = StObject.set(x, "stations", value.asInstanceOf[js.Any])
      
      inline def setStationsVarargs(value: Station*): Self = StObject.set(x, "stations", js.Array(value*))
    }
  }
  
  trait Station extends StObject {
    
    var geo_lat: String
    
    var geo_lon: String
    
    var id: Double
    
    var intl_name: String
    
    var line: Double
    
    var lineTransfers: js.Array[Double]
    
    var local_name: String
    
    var stationTransfers: js.Array[Double]
  }
  object Station {
    
    inline def apply(
      geo_lat: String,
      geo_lon: String,
      id: Double,
      intl_name: String,
      line: Double,
      lineTransfers: js.Array[Double],
      local_name: String,
      stationTransfers: js.Array[Double]
    ): Station = {
      val __obj = js.Dynamic.literal(geo_lat = geo_lat.asInstanceOf[js.Any], geo_lon = geo_lon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intl_name = intl_name.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineTransfers = lineTransfers.asInstanceOf[js.Any], local_name = local_name.asInstanceOf[js.Any], stationTransfers = stationTransfers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Station]
    }
    
    extension [Self <: Station](x: Self) {
      
      inline def setGeo_lat(value: String): Self = StObject.set(x, "geo_lat", value.asInstanceOf[js.Any])
      
      inline def setGeo_lon(value: String): Self = StObject.set(x, "geo_lon", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIntl_name(value: String): Self = StObject.set(x, "intl_name", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineTransfers(value: js.Array[Double]): Self = StObject.set(x, "lineTransfers", value.asInstanceOf[js.Any])
      
      inline def setLineTransfersVarargs(value: Double*): Self = StObject.set(x, "lineTransfers", js.Array(value*))
      
      inline def setLocal_name(value: String): Self = StObject.set(x, "local_name", value.asInstanceOf[js.Any])
      
      inline def setStationTransfers(value: js.Array[Double]): Self = StObject.set(x, "stationTransfers", value.asInstanceOf[js.Any])
      
      inline def setStationTransfersVarargs(value: Double*): Self = StObject.set(x, "stationTransfers", js.Array(value*))
    }
  }
}
