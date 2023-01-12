package typings.phaser.Phaser.Physics.Matter

import typings.phaser.Phaser.Types.Physics.Matter.MatterCollisionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Events {
  
  trait AfterAddEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * An array of the object(s) that have been added. May be a single body, constraint, composite or a mixture of these.
      */
    var `object`: js.Array[Any]
    
    /**
      * The source object of the event.
      */
    var source: Any
  }
  object AfterAddEvent {
    
    inline def apply(name: String, `object`: js.Array[Any], source: Any): AfterAddEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterAddEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AfterAddEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObject(value: js.Array[Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectVarargs(value: Any*): Self = StObject.set(x, "object", js.Array(value*))
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait AfterRemoveEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * An array of the object(s) that were removed. May be a single body, constraint, composite or a mixture of these.
      */
    var `object`: js.Array[Any]
    
    /**
      * The source object of the event.
      */
    var source: Any
  }
  object AfterRemoveEvent {
    
    inline def apply(name: String, `object`: js.Array[Any], source: Any): AfterRemoveEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterRemoveEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AfterRemoveEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObject(value: js.Array[Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectVarargs(value: Any*): Self = StObject.set(x, "object", js.Array(value*))
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait AfterUpdateEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * The source object of the event.
      */
    var source: Any
    
    /**
      * The Matter Engine `timing.timestamp` value for the event.
      */
    var timestamp: Double
  }
  object AfterUpdateEvent {
    
    inline def apply(name: String, source: Any, timestamp: Double): AfterUpdateEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterUpdateEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AfterUpdateEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeforeAddEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * An array of the object(s) to be added. May be a single body, constraint, composite or a mixture of these.
      */
    var `object`: js.Array[Any]
    
    /**
      * The source object of the event.
      */
    var source: Any
  }
  object BeforeAddEvent {
    
    inline def apply(name: String, `object`: js.Array[Any], source: Any): BeforeAddEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeAddEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeAddEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObject(value: js.Array[Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectVarargs(value: Any*): Self = StObject.set(x, "object", js.Array(value*))
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeforeRemoveEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * An array of the object(s) to be removed. May be a single body, constraint, composite or a mixture of these.
      */
    var `object`: js.Array[Any]
    
    /**
      * The source object of the event.
      */
    var source: Any
  }
  object BeforeRemoveEvent {
    
    inline def apply(name: String, `object`: js.Array[Any], source: Any): BeforeRemoveEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeRemoveEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeRemoveEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObject(value: js.Array[Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectVarargs(value: Any*): Self = StObject.set(x, "object", js.Array(value*))
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeforeUpdateEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * The source object of the event.
      */
    var source: Any
    
    /**
      * The Matter Engine `timing.timestamp` value for the event.
      */
    var timestamp: Double
  }
  object BeforeUpdateEvent {
    
    inline def apply(name: String, source: Any, timestamp: Double): BeforeUpdateEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeUpdateEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeUpdateEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollisionActiveEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * A list of all affected pairs in the collision.
      */
    var pairs: js.Array[MatterCollisionData]
    
    /**
      * The source object of the event.
      */
    var source: Any
    
    /**
      * The Matter Engine `timing.timestamp` value for the event.
      */
    var timestamp: Double
  }
  object CollisionActiveEvent {
    
    inline def apply(name: String, pairs: js.Array[MatterCollisionData], source: Any, timestamp: Double): CollisionActiveEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollisionActiveEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollisionActiveEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPairs(value: js.Array[MatterCollisionData]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
      
      inline def setPairsVarargs(value: MatterCollisionData*): Self = StObject.set(x, "pairs", js.Array(value*))
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollisionEndEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * A list of all affected pairs in the collision.
      */
    var pairs: js.Array[MatterCollisionData]
    
    /**
      * The source object of the event.
      */
    var source: Any
    
    /**
      * The Matter Engine `timing.timestamp` value for the event.
      */
    var timestamp: Double
  }
  object CollisionEndEvent {
    
    inline def apply(name: String, pairs: js.Array[MatterCollisionData], source: Any, timestamp: Double): CollisionEndEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollisionEndEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollisionEndEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPairs(value: js.Array[MatterCollisionData]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
      
      inline def setPairsVarargs(value: MatterCollisionData*): Self = StObject.set(x, "pairs", js.Array(value*))
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollisionStartEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * A list of all affected pairs in the collision.
      */
    var pairs: js.Array[MatterCollisionData]
    
    /**
      * The source object of the event.
      */
    var source: Any
    
    /**
      * The Matter Engine `timing.timestamp` value for the event.
      */
    var timestamp: Double
  }
  object CollisionStartEvent {
    
    inline def apply(name: String, pairs: js.Array[MatterCollisionData], source: Any, timestamp: Double): CollisionStartEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollisionStartEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollisionStartEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPairs(value: js.Array[MatterCollisionData]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
      
      inline def setPairsVarargs(value: MatterCollisionData*): Self = StObject.set(x, "pairs", js.Array(value*))
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait SleepEndEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * The source object of the event.
      */
    var source: Any
  }
  object SleepEndEvent {
    
    inline def apply(name: String, source: Any): SleepEndEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SleepEndEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SleepEndEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait SleepStartEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * The source object of the event.
      */
    var source: Any
  }
  object SleepStartEvent {
    
    inline def apply(name: String, source: Any): SleepStartEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SleepStartEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SleepStartEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
