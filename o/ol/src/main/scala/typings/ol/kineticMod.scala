package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kineticMod {
  
  @JSImport("ol/Kinetic", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Kinetic {
    def this(decay: Double, minVelocity: Double, delay: Double) = this()
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def begin(): Unit = js.native
    
    /* CompleteClass */
    override def end(): Boolean = js.native
    
    /* CompleteClass */
    override def getAngle(): Double = js.native
    
    /* CompleteClass */
    override def getDistance(): Double = js.native
    
    /* CompleteClass */
    override def update(x: Double, y: Double): Unit = js.native
  }
  
  trait Kinetic extends StObject {
    
    /**
      * FIXME empty description for jsdoc
      */
    def begin(): Unit
    
    def end(): Boolean
    
    def getAngle(): Double
    
    def getDistance(): Double
    
    def update(x: Double, y: Double): Unit
  }
  object Kinetic {
    
    inline def apply(
      begin: () => Unit,
      end: () => Boolean,
      getAngle: () => Double,
      getDistance: () => Double,
      update: (Double, Double) => Unit
    ): Kinetic = {
      val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end), getAngle = js.Any.fromFunction0(getAngle), getDistance = js.Any.fromFunction0(getDistance), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[Kinetic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Kinetic] (val x: Self) extends AnyVal {
      
      inline def setBegin(value: () => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction0(value))
      
      inline def setEnd(value: () => Boolean): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setGetAngle(value: () => Double): Self = StObject.set(x, "getAngle", js.Any.fromFunction0(value))
      
      inline def setGetDistance(value: () => Double): Self = StObject.set(x, "getDistance", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: (Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
