package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNumberMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def between(n: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(n.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("misc-utils-of-mine-generic/dist/src/number", "clamp")
  @js.native
  val clamp: js.Function3[/* n */ Double, /* min */ Double, /* max */ Double, Double] = js.native
  
  inline def counter(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("counter")().asInstanceOf[Double]
  
  @JSImport("misc-utils-of-mine-generic/dist/src/number", "float")
  @js.native
  val float: js.Function2[/* a */ Double, /* b */ Double, Double] = js.native
  
  @JSImport("misc-utils-of-mine-generic/dist/src/number", "floats")
  @js.native
  val floats: js.Function3[/* l */ Double, /* min */ Double, /* max */ Double, js.Array[Double]] = js.native
  
  @JSImport("misc-utils-of-mine-generic/dist/src/number", "int")
  @js.native
  val int: js.Function2[/* a */ Double, /* b */ Double, Double] = js.native
  
  inline def intBetween(n: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("intBetween")(n.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("misc-utils-of-mine-generic/dist/src/number", "ints")
  @js.native
  val ints: js.Function3[/* l */ Double, /* min */ Double, /* max */ Double, js.Array[Double]] = js.native
  
  inline def isPrime(num: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrime")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def randomFloatBetween(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFloatBetween")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def randomFloatsBetween(l: Double, min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFloatsBetween")(l.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def randomIntBetween(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomIntBetween")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def randomIntsBetween(l: Double, min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomIntsBetween")(l.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def randomItem[T](a: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("randomItem")(a.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def unique(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")().asInstanceOf[String]
  inline def unique(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
}
