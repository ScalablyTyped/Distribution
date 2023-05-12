package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kineticMod {
  
  /**
    * @module ol/Kinetic
    */
  /**
    * @classdesc
    * Implementation of inertial deceleration for map movement.
    *
    * @api
    */
  @JSImport("ol/Kinetic", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Kinetic {
    /**
      * @param {number} decay Rate of decay (must be negative).
      * @param {number} minVelocity Minimum velocity (pixels/millisecond).
      * @param {number} delay Delay to consider to calculate the kinetic
      *     initial values (milliseconds).
      */
    def this(decay: Double, minVelocity: Double, delay: Double) = this()
    
    /**
      * @private
      * @type {number}
      */
    /* private */ /* CompleteClass */
    var angle_ : Any = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def begin(): Unit = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ /* CompleteClass */
    var decay_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ /* CompleteClass */
    var delay_ : Any = js.native
    
    /**
      * @return {boolean} Whether we should do kinetic animation.
      */
    /* CompleteClass */
    override def end(): Boolean = js.native
    
    /**
      * @return {number} Angle of the kinetic panning animation (radians).
      */
    /* CompleteClass */
    override def getAngle(): Double = js.native
    
    /**
      * @return {number} Total distance travelled (pixels).
      */
    /* CompleteClass */
    override def getDistance(): Double = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ /* CompleteClass */
    var initialVelocity_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ /* CompleteClass */
    var minVelocity_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ /* CompleteClass */
    var points_ : Any = js.native
    
    /**
      * @param {number} x X.
      * @param {number} y Y.
      */
    /* CompleteClass */
    override def update(x: Double, y: Double): Unit = js.native
  }
  
  /**
    * @module ol/Kinetic
    */
  /**
    * @classdesc
    * Implementation of inertial deceleration for map movement.
    *
    * @api
    */
  trait Kinetic extends StObject {
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var angle_ : Any
    
    /**
      * FIXME empty description for jsdoc
      */
    def begin(): Unit
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var decay_ : Any
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var delay_ : Any
    
    /**
      * @return {boolean} Whether we should do kinetic animation.
      */
    def end(): Boolean
    
    /**
      * @return {number} Angle of the kinetic panning animation (radians).
      */
    def getAngle(): Double
    
    /**
      * @return {number} Total distance travelled (pixels).
      */
    def getDistance(): Double
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var initialVelocity_ : Any
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var minVelocity_ : Any
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var points_ : Any
    
    /**
      * @param {number} x X.
      * @param {number} y Y.
      */
    def update(x: Double, y: Double): Unit
  }
  object Kinetic {
    
    inline def apply(
      angle_ : Any,
      begin: () => Unit,
      decay_ : Any,
      delay_ : Any,
      end: () => Boolean,
      getAngle: () => Double,
      getDistance: () => Double,
      initialVelocity_ : Any,
      minVelocity_ : Any,
      points_ : Any,
      update: (Double, Double) => Unit
    ): Kinetic = {
      val __obj = js.Dynamic.literal(angle_ = angle_.asInstanceOf[js.Any], begin = js.Any.fromFunction0(begin), decay_ = decay_.asInstanceOf[js.Any], delay_ = delay_.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), getAngle = js.Any.fromFunction0(getAngle), getDistance = js.Any.fromFunction0(getDistance), initialVelocity_ = initialVelocity_.asInstanceOf[js.Any], minVelocity_ = minVelocity_.asInstanceOf[js.Any], points_ = points_.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[Kinetic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Kinetic] (val x: Self) extends AnyVal {
      
      inline def setAngle_(value: Any): Self = StObject.set(x, "angle_", value.asInstanceOf[js.Any])
      
      inline def setBegin(value: () => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction0(value))
      
      inline def setDecay_(value: Any): Self = StObject.set(x, "decay_", value.asInstanceOf[js.Any])
      
      inline def setDelay_(value: Any): Self = StObject.set(x, "delay_", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: () => Boolean): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setGetAngle(value: () => Double): Self = StObject.set(x, "getAngle", js.Any.fromFunction0(value))
      
      inline def setGetDistance(value: () => Double): Self = StObject.set(x, "getDistance", js.Any.fromFunction0(value))
      
      inline def setInitialVelocity_(value: Any): Self = StObject.set(x, "initialVelocity_", value.asInstanceOf[js.Any])
      
      inline def setMinVelocity_(value: Any): Self = StObject.set(x, "minVelocity_", value.asInstanceOf[js.Any])
      
      inline def setPoints_(value: Any): Self = StObject.set(x, "points_", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
