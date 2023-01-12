package typings.netgear

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CurrentDeviceDownBandwidth extends StObject {
    
    var currentDeviceDownBandwidth: String
    
    var currentDeviceUpBandwidth: String
  }
  object CurrentDeviceDownBandwidth {
    
    inline def apply(currentDeviceDownBandwidth: String, currentDeviceUpBandwidth: String): CurrentDeviceDownBandwidth = {
      val __obj = js.Dynamic.literal(currentDeviceDownBandwidth = currentDeviceDownBandwidth.asInstanceOf[js.Any], currentDeviceUpBandwidth = currentDeviceUpBandwidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentDeviceDownBandwidth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrentDeviceDownBandwidth] (val x: Self) extends AnyVal {
      
      inline def setCurrentDeviceDownBandwidth(value: String): Self = StObject.set(x, "currentDeviceDownBandwidth", value.asInstanceOf[js.Any])
      
      inline def setCurrentDeviceUpBandwidth(value: String): Self = StObject.set(x, "currentDeviceUpBandwidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait CurrentVersion extends StObject {
    
    var currentVersion: String
    
    var newVersion: String
    
    var releaseNote: String
  }
  object CurrentVersion {
    
    inline def apply(currentVersion: String, newVersion: String, releaseNote: String): CurrentVersion = {
      val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], newVersion = newVersion.asInstanceOf[js.Any], releaseNote = releaseNote.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentVersion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrentVersion] (val x: Self) extends AnyVal {
      
      inline def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      inline def setNewVersion(value: String): Self = StObject.set(x, "newVersion", value.asInstanceOf[js.Any])
      
      inline def setReleaseNote(value: String): Self = StObject.set(x, "releaseNote", value.asInstanceOf[js.Any])
    }
  }
  
  trait DaylightSaving extends StObject {
    
    var DaylightSaving: String
    
    var IndexValue: String
    
    var TimeZone: String
  }
  object DaylightSaving {
    
    inline def apply(DaylightSaving: String, IndexValue: String, TimeZone: String): DaylightSaving = {
      val __obj = js.Dynamic.literal(DaylightSaving = DaylightSaving.asInstanceOf[js.Any], IndexValue = IndexValue.asInstanceOf[js.Any], TimeZone = TimeZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[DaylightSaving]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DaylightSaving] (val x: Self) extends AnyVal {
      
      inline def setDaylightSaving(value: String): Self = StObject.set(x, "DaylightSaving", value.asInstanceOf[js.Any])
      
      inline def setIndexValue(value: String): Self = StObject.set(x, "IndexValue", value.asInstanceOf[js.Any])
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "TimeZone", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: Double
    
    var newDownlinkBandwidth: Double
    
    var newUplinkBandwidth: Double
  }
  object Enabled {
    
    inline def apply(enabled: Double, newDownlinkBandwidth: Double, newUplinkBandwidth: Double): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], newDownlinkBandwidth = newDownlinkBandwidth.asInstanceOf[js.Any], newUplinkBandwidth = newUplinkBandwidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Double): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setNewDownlinkBandwidth(value: Double): Self = StObject.set(x, "newDownlinkBandwidth", value.asInstanceOf[js.Any])
      
      inline def setNewUplinkBandwidth(value: Double): Self = StObject.set(x, "newUplinkBandwidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait NTPServer1 extends StObject {
    
    var NTPServer1: String
    
    var NTPServer2: String
    
    var NTPServer3: String
    
    var NTPServer4: String
  }
  object NTPServer1 {
    
    inline def apply(NTPServer1: String, NTPServer2: String, NTPServer3: String, NTPServer4: String): NTPServer1 = {
      val __obj = js.Dynamic.literal(NTPServer1 = NTPServer1.asInstanceOf[js.Any], NTPServer2 = NTPServer2.asInstanceOf[js.Any], NTPServer3 = NTPServer3.asInstanceOf[js.Any], NTPServer4 = NTPServer4.asInstanceOf[js.Any])
      __obj.asInstanceOf[NTPServer1]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NTPServer1] (val x: Self) extends AnyVal {
      
      inline def setNTPServer1(value: String): Self = StObject.set(x, "NTPServer1", value.asInstanceOf[js.Any])
      
      inline def setNTPServer2(value: String): Self = StObject.set(x, "NTPServer2", value.asInstanceOf[js.Any])
      
      inline def setNTPServer3(value: String): Self = StObject.set(x, "NTPServer3", value.asInstanceOf[js.Any])
      
      inline def setNTPServer4(value: String): Self = StObject.set(x, "NTPServer4", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewPortMappingInfo extends StObject {
    
    var NewPortMappingInfo: Unit
    
    var NewPortMappingNumberOfEntries: String
  }
  object NewPortMappingInfo {
    
    inline def apply(NewPortMappingInfo: Unit, NewPortMappingNumberOfEntries: String): NewPortMappingInfo = {
      val __obj = js.Dynamic.literal(NewPortMappingInfo = NewPortMappingInfo.asInstanceOf[js.Any], NewPortMappingNumberOfEntries = NewPortMappingNumberOfEntries.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewPortMappingInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewPortMappingInfo] (val x: Self) extends AnyVal {
      
      inline def setNewPortMappingInfo(value: Unit): Self = StObject.set(x, "NewPortMappingInfo", value.asInstanceOf[js.Any])
      
      inline def setNewPortMappingNumberOfEntries(value: String): Self = StObject.set(x, "NewPortMappingNumberOfEntries", value.asInstanceOf[js.Any])
    }
  }
}
