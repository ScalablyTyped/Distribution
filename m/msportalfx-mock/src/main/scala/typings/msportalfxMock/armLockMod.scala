package typings.msportalfxMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object armLockMod {
  
  trait ArmLockData extends StObject {
    
    /**
      * Extra properties on a lock
      */
    var properties: LockProperties
  }
  object ArmLockData {
    
    inline def apply(properties: LockProperties): ArmLockData = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArmLockData]
    }
    
    extension [Self <: ArmLockData](x: Self) {
      
      inline def setProperties(value: LockProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lock
    extends StObject
       with LockBase
       with ArmLockData
  object Lock {
    
    inline def apply(id: String, name: String, properties: LockProperties, `type`: String): Lock = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lock]
    }
  }
  
  trait LockBase extends StObject {
    
    /**
      * The arm resource id the lock is on
      */
    var id: String
    
    /**
      * The name given to the lock
      */
    var name: String
    
    /**
      * The lock resource type.
      */
    var `type`: String
  }
  object LockBase {
    
    inline def apply(id: String, name: String, `type`: String): LockBase = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LockBase]
    }
    
    extension [Self <: LockBase](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LockProperties extends StObject {
    
    /**
      * The lock strength
      */
    var level: String
    
    /**
      * Notes about the lock
      */
    var notes: String
  }
  object LockProperties {
    
    inline def apply(level: String, notes: String): LockProperties = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any])
      __obj.asInstanceOf[LockProperties]
    }
    
    extension [Self <: LockProperties](x: Self) {
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    }
  }
}
