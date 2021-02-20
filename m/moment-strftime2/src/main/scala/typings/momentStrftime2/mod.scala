package typings.momentStrftime2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moment-strftime2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("moment-strftime2", "installTo")
  @js.native
  def installTo(moment: js.Object): Unit = js.native
  
  @JSImport("moment-strftime2", "modifiers")
  @js.native
  def modifiers: Modifiers_ = js.native
  @scala.inline
  def modifiers_=(x: Modifiers_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-strftime2", "separator")
  @js.native
  def separator: String = js.native
  @scala.inline
  def separator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("separator")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Modifiers_ extends StObject {
    
    var A: String = js.native
    
    var B: String = js.native
    
    var C: js.UndefOr[String] = js.native
    
    var D: String = js.native
    
    var E: js.UndefOr[String] = js.native
    
    var F: String = js.native
    
    var G: js.UndefOr[String] = js.native
    
    var H: String = js.native
    
    var I: String = js.native
    
    var J: js.UndefOr[String] = js.native
    
    var K: js.UndefOr[String] = js.native
    
    var L: String = js.native
    
    var M: String = js.native
    
    var N: js.UndefOr[String] = js.native
    
    var O: js.UndefOr[String] = js.native
    
    var P: String = js.native
    
    @JSName("%")
    var Percentsign: String = js.native
    
    var Q: js.UndefOr[String] = js.native
    
    var R: String = js.native
    
    var S: String = js.native
    
    var T: String = js.native
    
    var U: js.UndefOr[String] = js.native
    
    var V: String = js.native
    
    var W: String = js.native
    
    var X: js.UndefOr[String] = js.native
    
    var Y: String = js.native
    
    var Z: String = js.native
    
    var a: String = js.native
    
    var b: String = js.native
    
    var c: js.UndefOr[String] = js.native
    
    var d: String = js.native
    
    var e: String = js.native
    
    var f: js.UndefOr[String] = js.native
    
    var g: String = js.native
    
    var h: String = js.native
    
    var i: js.UndefOr[String] = js.native
    
    var j: String = js.native
    
    var k: String = js.native
    
    var l: String = js.native
    
    var m: String = js.native
    
    var n: js.UndefOr[String] = js.native
    
    var o: js.UndefOr[String] = js.native
    
    var p: String = js.native
    
    var q: js.UndefOr[String] = js.native
    
    var r: String = js.native
    
    var s: String = js.native
    
    var t: js.UndefOr[String] = js.native
    
    var u: String = js.native
    
    var v: js.UndefOr[String] = js.native
    
    var w: String = js.native
    
    var x: js.UndefOr[String] = js.native
    
    var y: String = js.native
    
    var z: String = js.native
  }
  object Modifiers_ {
    
    @scala.inline
    def apply(
      A: String,
      B: String,
      D: String,
      F: String,
      H: String,
      I: String,
      L: String,
      M: String,
      P: String,
      Percentsign: String,
      R: String,
      S: String,
      T: String,
      V: String,
      W: String,
      Y: String,
      Z: String,
      a: String,
      b: String,
      d: String,
      e: String,
      g: String,
      h: String,
      j: String,
      k: String,
      l: String,
      m: String,
      p: String,
      r: String,
      s: String,
      u: String,
      w: String,
      y: String,
      z: String
    ): Modifiers_ = {
      val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], B = B.asInstanceOf[js.Any], D = D.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any], H = H.asInstanceOf[js.Any], I = I.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any], W = W.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.updateDynamic("%")(Percentsign.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modifiers_]
    }
    
    @scala.inline
    implicit class Modifiers_MutableBuilder[Self <: Modifiers_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: String): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: String): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "E", js.undefined)
      
      @scala.inline
      def setF(value: String): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      @scala.inline
      def setG(value: String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGUndefined: Self = StObject.set(x, "G", js.undefined)
      
      @scala.inline
      def setH(value: String): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI(value: String): Self = StObject.set(x, "I", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      @scala.inline
      def setJ(value: String): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJUndefined: Self = StObject.set(x, "J", js.undefined)
      
      @scala.inline
      def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKUndefined: Self = StObject.set(x, "K", js.undefined)
      
      @scala.inline
      def setL(value: String): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM(value: String): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      @scala.inline
      def setO(value: String): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOUndefined: Self = StObject.set(x, "O", js.undefined)
      
      @scala.inline
      def setP(value: String): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentsign(value: String): Self = StObject.set(x, "%", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQ(value: String): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUndefined: Self = StObject.set(x, "Q", js.undefined)
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: String): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTUndefined: Self = StObject.set(x, "t", js.undefined)
      
      @scala.inline
      def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUUndefined: Self = StObject.set(x, "U", js.undefined)
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      @scala.inline
      def setW(value: String): Self = StObject.set(x, "W", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "X", js.undefined)
      
      @scala.inline
      def setY(value: String): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: String): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object momentAugmentingMod {
    
    @js.native
    trait Moment extends StObject {
      
      def strftime(pattern: String): String = js.native
    }
    object Moment {
      
      @scala.inline
      def apply(strftime: String => String): Moment = {
        val __obj = js.Dynamic.literal(strftime = js.Any.fromFunction1(strftime))
        __obj.asInstanceOf[Moment]
      }
      
      @scala.inline
      implicit class MomentMutableBuilder[Self <: Moment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStrftime(value: String => String): Self = StObject.set(x, "strftime", js.Any.fromFunction1(value))
      }
    }
  }
  
  object momentTimezoneAugmentingMod {
    
    @js.native
    trait Moment extends StObject {
      
      def strftime(pattern: String): String = js.native
    }
    object Moment {
      
      @scala.inline
      def apply(strftime: String => String): Moment = {
        val __obj = js.Dynamic.literal(strftime = js.Any.fromFunction1(strftime))
        __obj.asInstanceOf[Moment]
      }
      
      @scala.inline
      implicit class MomentMutableBuilder[Self <: Moment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStrftime(value: String => String): Self = StObject.set(x, "strftime", js.Any.fromFunction1(value))
      }
    }
  }
}
