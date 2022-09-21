package typings.p2

import typings.p2.mod.AddBodyEvent
import typings.p2.mod.AddSpringEvent
import typings.p2.mod.BeginContactEvent
import typings.p2.mod.EndContactEvent
import typings.p2.mod.ImpactEvent
import typings.p2.mod.PostBroadphaseEvent
import typings.p2.mod.PreSolveEvent
import typings.p2.mod.RemoveBodyEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object p2Strings {
  
  @js.native
  sealed trait addBody extends StObject
  inline def addBody: addBody = "addBody".asInstanceOf[addBody]
  
  @js.native
  sealed trait addSpring extends StObject
  inline def addSpring: addSpring = "addSpring".asInstanceOf[addSpring]
  
  @js.native
  sealed trait beginContact extends StObject
  inline def beginContact: beginContact = "beginContact".asInstanceOf[beginContact]
  
  @js.native
  sealed trait body
    extends StObject
       with AddBodyEvent
       with RemoveBodyEvent
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait bodyA
    extends StObject
       with BeginContactEvent
       with EndContactEvent
       with ImpactEvent
  inline def bodyA: bodyA = "bodyA".asInstanceOf[bodyA]
  
  @js.native
  sealed trait bodyB
    extends StObject
       with BeginContactEvent
       with EndContactEvent
       with ImpactEvent
  inline def bodyB: bodyB = "bodyB".asInstanceOf[bodyB]
  
  @js.native
  sealed trait contactEquation
    extends StObject
       with ImpactEvent
  inline def contactEquation: contactEquation = "contactEquation".asInstanceOf[contactEquation]
  
  @js.native
  sealed trait contactEquations
    extends StObject
       with BeginContactEvent
       with PreSolveEvent
  inline def contactEquations: contactEquations = "contactEquations".asInstanceOf[contactEquations]
  
  @js.native
  sealed trait endContact extends StObject
  inline def endContact: endContact = "endContact".asInstanceOf[endContact]
  
  @js.native
  sealed trait frictionEquations
    extends StObject
       with PreSolveEvent
  inline def frictionEquations: frictionEquations = "frictionEquations".asInstanceOf[frictionEquations]
  
  @js.native
  sealed trait impact extends StObject
  inline def impact: impact = "impact".asInstanceOf[impact]
  
  @js.native
  sealed trait pairs
    extends StObject
       with PostBroadphaseEvent
  inline def pairs: pairs = "pairs".asInstanceOf[pairs]
  
  @js.native
  sealed trait postBroadphase extends StObject
  inline def postBroadphase: postBroadphase = "postBroadphase".asInstanceOf[postBroadphase]
  
  @js.native
  sealed trait postStep extends StObject
  inline def postStep: postStep = "postStep".asInstanceOf[postStep]
  
  @js.native
  sealed trait preSolve extends StObject
  inline def preSolve: preSolve = "preSolve".asInstanceOf[preSolve]
  
  @js.native
  sealed trait removeBody extends StObject
  inline def removeBody: removeBody = "removeBody".asInstanceOf[removeBody]
  
  @js.native
  sealed trait shapeA
    extends StObject
       with BeginContactEvent
       with EndContactEvent
       with ImpactEvent
  inline def shapeA: shapeA = "shapeA".asInstanceOf[shapeA]
  
  @js.native
  sealed trait shapeB
    extends StObject
       with BeginContactEvent
       with EndContactEvent
       with ImpactEvent
  inline def shapeB: shapeB = "shapeB".asInstanceOf[shapeB]
  
  @js.native
  sealed trait sleep extends StObject
  inline def sleep: sleep = "sleep".asInstanceOf[sleep]
  
  @js.native
  sealed trait sleepy extends StObject
  inline def sleepy: sleepy = "sleepy".asInstanceOf[sleepy]
  
  @js.native
  sealed trait spring
    extends StObject
       with AddSpringEvent
  inline def spring: spring = "spring".asInstanceOf[spring]
  
  @js.native
  sealed trait `type`
    extends StObject
       with AddBodyEvent
       with AddSpringEvent
       with BeginContactEvent
       with EndContactEvent
       with ImpactEvent
       with PostBroadphaseEvent
       with PreSolveEvent
       with RemoveBodyEvent
  inline def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait wakeup extends StObject
  inline def wakeup: wakeup = "wakeup".asInstanceOf[wakeup]
}
