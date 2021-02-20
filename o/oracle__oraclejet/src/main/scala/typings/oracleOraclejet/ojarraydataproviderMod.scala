package typings.oracleOraclejet

import typings.oracleOraclejet.anon.IdAttribute
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.EventListener
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojarraydataproviderMod {
  
  @JSImport("@oracle/oraclejet/ojarraydataprovider", JSImport.Namespace)
  @js.native
  class ^[K, D] protected () extends ArrayDataProvider[K, D] {
    def this(data: js.Array[_]) = this()
    def this(data: js.Function0[js.Array[_]]) = this()
    def this(data: js.Array[_], options: IdAttribute[D]) = this()
    def this(data: js.Function0[js.Array[_]], options: IdAttribute[D]) = this()
  }
  
  @js.native
  trait ArrayDataProvider[K, D] extends DataProvider[K, D] {
    
    def addEventListener(eventType: String, listener: EventListener): Unit = js.native
    
    def getCapability(): js.Any = js.native
    
    def removeEventListener(eventType: String, listener: EventListener): Unit = js.native
  }
  
  @js.native
  trait SortComparators[D] extends StObject {
    
    var comparators: Map[/* keyof D */ String, js.Function2[/* a */ _, /* b */ _, Double]] = js.native
  }
  object SortComparators {
    
    @scala.inline
    def apply[D](comparators: Map[/* keyof D */ String, js.Function2[/* a */ _, /* b */ _, Double]]): SortComparators[D] = {
      val __obj = js.Dynamic.literal(comparators = comparators.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortComparators[D]]
    }
    
    @scala.inline
    implicit class SortComparatorsMutableBuilder[Self <: SortComparators[_], D] (val x: Self with SortComparators[D]) extends AnyVal {
      
      @scala.inline
      def setComparators(value: Map[/* keyof D */ String, js.Function2[/* a */ _, /* b */ _, Double]]): Self = StObject.set(x, "comparators", value.asInstanceOf[js.Any])
    }
  }
}
