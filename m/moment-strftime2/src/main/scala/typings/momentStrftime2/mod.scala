package typings.momentStrftime2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moment-strftime2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def installTo(moment: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installTo")(moment.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("moment-strftime2", "modifiers")
  @js.native
  def modifiers: Modifiers_ = js.native
  inline def modifiers_=(x: Modifiers_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-strftime2", "separator")
  @js.native
  def separator: String = js.native
  inline def separator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("separator")(x.asInstanceOf[js.Any])
  
  trait Modifiers_ extends StObject {
    
    var A: String
    
    var B: String
    
    var C: js.UndefOr[String] = js.undefined
    
    var D: String
    
    var E: js.UndefOr[String] = js.undefined
    
    var F: String
    
    var G: js.UndefOr[String] = js.undefined
    
    var H: String
    
    var I: String
    
    var J: js.UndefOr[String] = js.undefined
    
    var K: js.UndefOr[String] = js.undefined
    
    var L: String
    
    var M: String
    
    var N: js.UndefOr[String] = js.undefined
    
    var O: js.UndefOr[String] = js.undefined
    
    var P: String
    
    @JSName("%")
    var Percentsign: String
    
    var Q: js.UndefOr[String] = js.undefined
    
    var R: String
    
    var S: String
    
    var T: String
    
    var U: js.UndefOr[String] = js.undefined
    
    var V: String
    
    var W: String
    
    var X: js.UndefOr[String] = js.undefined
    
    var Y: String
    
    var Z: String
    
    var a: String
    
    var b: String
    
    var c: js.UndefOr[String] = js.undefined
    
    var d: String
    
    var e: String
    
    var f: js.UndefOr[String] = js.undefined
    
    var g: String
    
    var h: String
    
    var i: js.UndefOr[String] = js.undefined
    
    var j: String
    
    var k: String
    
    var l: String
    
    var m: String
    
    var n: js.UndefOr[String] = js.undefined
    
    var o: js.UndefOr[String] = js.undefined
    
    var p: String
    
    var q: js.UndefOr[String] = js.undefined
    
    var r: String
    
    var s: String
    
    var t: js.UndefOr[String] = js.undefined
    
    var u: String
    
    var v: js.UndefOr[String] = js.undefined
    
    var w: String
    
    var x: js.UndefOr[String] = js.undefined
    
    var y: String
    
    var z: String
  }
  object Modifiers_ {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Modifiers_] (val x: Self) extends AnyVal {
      
      inline def setA(value: String): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      inline def setB(value: String): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      inline def setD(value: String): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "E", js.undefined)
      
      inline def setF(value: String): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
      
      inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      inline def setG(value: String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setGUndefined: Self = StObject.set(x, "G", js.undefined)
      
      inline def setH(value: String): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
      
      inline def setI(value: String): Self = StObject.set(x, "I", value.asInstanceOf[js.Any])
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setJ(value: String): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      inline def setJUndefined: Self = StObject.set(x, "J", js.undefined)
      
      inline def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setKUndefined: Self = StObject.set(x, "K", js.undefined)
      
      inline def setL(value: String): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setM(value: String): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      inline def setO(value: String): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
      
      inline def setOUndefined: Self = StObject.set(x, "O", js.undefined)
      
      inline def setP(value: String): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      inline def setPercentsign(value: String): Self = StObject.set(x, "%", value.asInstanceOf[js.Any])
      
      inline def setQ(value: String): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "Q", js.undefined)
      
      inline def setR(value: String): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      inline def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      inline def setT(value: String): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
      
      inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
      
      inline def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setUUndefined: Self = StObject.set(x, "U", js.undefined)
      
      inline def setV(value: String): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      inline def setW(value: String): Self = StObject.set(x, "W", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "X", js.undefined)
      
      inline def setY(value: String): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: String): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object momentAugmentingMod {
    
    trait Moment extends StObject {
      
      def strftime(pattern: String): String
    }
    object Moment {
      
      inline def apply(strftime: String => String): Moment = {
        val __obj = js.Dynamic.literal(strftime = js.Any.fromFunction1(strftime))
        __obj.asInstanceOf[Moment]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Moment] (val x: Self) extends AnyVal {
        
        inline def setStrftime(value: String => String): Self = StObject.set(x, "strftime", js.Any.fromFunction1(value))
      }
    }
  }
  
  /* augmented module */
  object momentTimezoneAugmentingMod {
    
    trait Moment extends StObject {
      
      def strftime(pattern: String): String
    }
    object Moment {
      
      inline def apply(strftime: String => String): Moment = {
        val __obj = js.Dynamic.literal(strftime = js.Any.fromFunction1(strftime))
        __obj.asInstanceOf[Moment]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Moment] (val x: Self) extends AnyVal {
        
        inline def setStrftime(value: String => String): Self = StObject.set(x, "strftime", js.Any.fromFunction1(value))
      }
    }
  }
}
