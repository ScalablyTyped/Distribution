package typings.phaser.Phaser.Physics.Matter

import typings.phaser.Phaser.Types.Physics.Matter.MatterCollisionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Events {
  
  @js.native
  trait AfterAddEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String = js.native
    
    /**
      * An array of the object(s) that have been added. May be a single body, constraint, composite or a mixture of these.
      */
    var `object`: js.Array[_] = js.native
    
    /**
      * The source object of the event.
      */
    var source: js.Any = js.native
  }
  object AfterAddEvent {
    
    @scala.inline
    def apply(name: String, `object`: js.Array[_], source: js.Any): AfterAddEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterAddEvent]
    }
    
    @scala.inline
    implicit class AfterAddEventMutableBuilder[Self <: AfterAddEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: js.Array[_]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectVarargs(value: js.Any*): Self = StObject.set(x, "object", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AfterRemoveEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String = js.native
    
    /**
      * An array of the object(s) that were removed. May be a single body, constraint, composite or a mixture of these.
      */
    var `object`: js.Array[_] = js.native
    
    /**
      * The source object of the event.
      */
    var source: js.Any = js.native
  }
  object AfterRemoveEvent {
    
    @scala.inline
    def apply(name: String, `object`: js.Array[_], source: js.Any): AfterRemoveEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterRemoveEvent]
    }
    
    @scala.inline
    implicit class AfterRemoveEventMutableBuilder[Self <: AfterRemoveEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: js.Array[_]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectVarargs(value: js.Any*): Self = StObject.set(x, "object", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AfterUpdateEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String = js.native
    
    /**
      * The source object of the event.
      */
    var source: js.Any = js.native
    
    /**
      * The Matter Engine `timing.timestamp` value for the event.
      */
    var timestamp: Double = js.native
  }
  object AfterUpdateEvent {
    
    @scala.inline
    def apply(name: String, source: js.Any, timestamp: Double): AfterUpdateEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterUpdateEvent]
    }
    
    @scala.inline
    implicit class AfterUpdateEventMutableBuilder[Self <: AfterUpdateEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BeforeAddEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String = js.native
    
    /**
      * An array of the object(s) to be added. May be a single body, constraint, composite or a mixture of these.
      */
    var `object`: js.Array[_] = js.native
    
    /**
      * The source object of the event.
      */
    var source: js.Any = js.native
  }
  object BeforeAddEvent {
    
    @scala.inline
    def apply(name: String, `object`: js.Array[_], source: js.Any): BeforeAddEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeAddEvent]
    }
    
    @scala.inline
    implicit class BeforeAddEventMutableBuilder[Self <: BeforeAddEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: js.Array[_]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectVarargs(value: js.Any*): Self = StObject.set(x, "object", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BeforeRemoveEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String = js.native
    
    /**
      * An array of the object(s) to be removed. May be a single body, constraint, composite or a mixture of these.
      */
    var `object`: js.Array[_] = js.native
    
    /**
      * The source object of the event.
      */
    var source: js.Any = js.native
  }
  object BeforeRemoveEvent {
    
    @scala.inline
    def apply(name: String, `object`: js.Array[_], source: js.Any): BeforeRemoveEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeRemoveEvent]
    }
    
    @scala.inline
    implicit class BeforeRemoveEventMutableBuilder[Self <: BeforeRemoveEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: js.Array[_]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectVarargs(value: js.Any*): Self = StObject.set(x, "object", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BeforeUpdateEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String = js.native
    
    /**
      * The source object of the event.
      */
    var source: js.Any = js.native
    
    /**
      * The Matter Engine `timing.timestamp` value for the event.
      */
    var timestamp: Double = js.native
  }
  object BeforeUpdateEvent {
    
    @scala.inline
    def apply(name: String, source: js.Any, timestamp: Double): BeforeUpdateEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeUpdateEvent]
    }
    
    @scala.inline
    implicit class BeforeUpdateEventMutableBuilder[Self <: BeforeUpdateEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CollisionActiveEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String = js.native
    
    /**
      * A list of all affected pairs in the collision.
      */
    var pairs: js.Array[MatterCollisionData] = js.native
    
    /**
      * The source object of the event.
      */
    var source: js.Any = js.native
    
    /**
      * The Matter Engine `timing.timestamp` value for the event.
      */
    var timestamp: Double = js.native
  }
  object CollisionActiveEvent {
    
    @scala.inline
    def apply(name: String, pairs: js.Array[MatterCollisionData], source: js.Any, timestamp: Double): CollisionActiveEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollisionActiveEvent]
    }
    
    @scala.inline
    implicit class CollisionActiveEventMutableBuilder[Self <: CollisionActiveEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPairs(value: js.Array[MatterCollisionData]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPairsVarargs(value: MatterCollisionData*): Self = StObject.set(x, "pairs", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CollisionEndEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String = js.native
    
    /**
      * A list of all affected pairs in the collision.
      */
    var pairs: js.Array[MatterCollisionData] = js.native
    
    /**
      * The source object of the event.
      */
    var source: js.Any = js.native
    
    /**
      * The Matter Engine `timing.timestamp` value for the event.
      */
    var timestamp: Double = js.native
  }
  object CollisionEndEvent {
    
    @scala.inline
    def apply(name: String, pairs: js.Array[MatterCollisionData], source: js.Any, timestamp: Double): CollisionEndEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollisionEndEvent]
    }
    
    @scala.inline
    implicit class CollisionEndEventMutableBuilder[Self <: CollisionEndEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPairs(value: js.Array[MatterCollisionData]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPairsVarargs(value: MatterCollisionData*): Self = StObject.set(x, "pairs", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CollisionStartEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String = js.native
    
    /**
      * A list of all affected pairs in the collision.
      */
    var pairs: js.Array[MatterCollisionData] = js.native
    
    /**
      * The source object of the event.
      */
    var source: js.Any = js.native
    
    /**
      * The Matter Engine `timing.timestamp` value for the event.
      */
    var timestamp: Double = js.native
  }
  object CollisionStartEvent {
    
    @scala.inline
    def apply(name: String, pairs: js.Array[MatterCollisionData], source: js.Any, timestamp: Double): CollisionStartEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollisionStartEvent]
    }
    
    @scala.inline
    implicit class CollisionStartEventMutableBuilder[Self <: CollisionStartEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPairs(value: js.Array[MatterCollisionData]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPairsVarargs(value: MatterCollisionData*): Self = StObject.set(x, "pairs", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SleepEndEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String = js.native
    
    /**
      * The source object of the event.
      */
    var source: js.Any = js.native
  }
  object SleepEndEvent {
    
    @scala.inline
    def apply(name: String, source: js.Any): SleepEndEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SleepEndEvent]
    }
    
    @scala.inline
    implicit class SleepEndEventMutableBuilder[Self <: SleepEndEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SleepStartEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String = js.native
    
    /**
      * The source object of the event.
      */
    var source: js.Any = js.native
  }
  object SleepStartEvent {
    
    @scala.inline
    def apply(name: String, source: js.Any): SleepStartEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SleepStartEvent]
    }
    
    @scala.inline
    implicit class SleepStartEventMutableBuilder[Self <: SleepStartEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
