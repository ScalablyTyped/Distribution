package typings.postgresRange

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("postgres-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postgres-range", "RANGE_EMPTY")
  @js.native
  val RANGE_EMPTY: /* 2 */ Double = js.native
  
  @JSImport("postgres-range", "RANGE_LB_INC")
  @js.native
  val RANGE_LB_INC: /* 4 */ Double = js.native
  
  @JSImport("postgres-range", "RANGE_LB_INF")
  @js.native
  val RANGE_LB_INF: /* 16 */ Double = js.native
  
  @JSImport("postgres-range", "RANGE_UB_INC")
  @js.native
  val RANGE_UB_INC: /* 8 */ Double = js.native
  
  @JSImport("postgres-range", "RANGE_UB_INF")
  @js.native
  val RANGE_UB_INF: /* 32 */ Double = js.native
  
  @JSImport("postgres-range", "Range")
  @js.native
  open class Range[T] protected () extends StObject {
    def this(lower: T, upper: T, mask: Double) = this()
    def this(lower: T, upper: Null, mask: Double) = this()
    def this(lower: Null, upper: T, mask: Double) = this()
    def this(lower: Null, upper: Null, mask: Double) = this()
    
    def containsPoint(point: T): Boolean = js.native
    
    def containsRange(range: Range[T]): Boolean = js.native
    
    def hasLowerBound(): Boolean = js.native
    
    def hasMask(flag: Double): Boolean = js.native
    
    def hasUpperBound(): Boolean = js.native
    
    def isBounded(): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isLowerBoundClosed(): Boolean = js.native
    
    def isUpperBoundClosed(): Boolean = js.native
    
    var lower: T | Null = js.native
    
    var upper: T | Null = js.native
  }
  
  inline def parse(input: String): Range[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Range[String]]
  inline def parse[T](source: String, transform: js.Function1[/* value */ String, T]): Range[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Range[T]]
  
  inline def serialize[T](range: Range[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(range.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize[T](range: Range[T], format: js.Function1[/* value */ T, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(range.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
}
