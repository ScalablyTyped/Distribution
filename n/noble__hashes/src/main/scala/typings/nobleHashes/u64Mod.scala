package typings.nobleHashes

import typings.nobleHashes.anon.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object u64Mod {
  
  @JSImport("@noble/hashes/_u64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@noble/hashes/_u64", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/_u64", "default.add")
    @js.native
    def add: js.Function4[/* Ah */ Double, /* Al */ Double, /* Bh */ Double, /* Bl */ Double, H] = js.native
    inline def add(Ah: Double, Al: Double, Bh: Double, Bl: Double): H = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(Ah.asInstanceOf[js.Any], Al.asInstanceOf[js.Any], Bh.asInstanceOf[js.Any], Bl.asInstanceOf[js.Any])).asInstanceOf[H]
    
    inline def add3H(low: Double, Ah: Double, Bh: Double, Ch: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add3H")(low.asInstanceOf[js.Any], Ah.asInstanceOf[js.Any], Bh.asInstanceOf[js.Any], Ch.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def add3L(Al: Double, Bl: Double, Cl: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add3L")(Al.asInstanceOf[js.Any], Bl.asInstanceOf[js.Any], Cl.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def add4H(low: Double, Ah: Double, Bh: Double, Ch: Double, Dh: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add4H")(low.asInstanceOf[js.Any], Ah.asInstanceOf[js.Any], Bh.asInstanceOf[js.Any], Ch.asInstanceOf[js.Any], Dh.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def add4L(Al: Double, Bl: Double, Cl: Double, Dl: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add4L")(Al.asInstanceOf[js.Any], Bl.asInstanceOf[js.Any], Cl.asInstanceOf[js.Any], Dl.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def add5H(low: Double, Ah: Double, Bh: Double, Ch: Double, Dh: Double, Eh: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add5H")(low.asInstanceOf[js.Any], Ah.asInstanceOf[js.Any], Bh.asInstanceOf[js.Any], Ch.asInstanceOf[js.Any], Dh.asInstanceOf[js.Any], Eh.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def add5L(Al: Double, Bl: Double, Cl: Double, Dl: Double, El: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add5L")(Al.asInstanceOf[js.Any], Bl.asInstanceOf[js.Any], Cl.asInstanceOf[js.Any], Dl.asInstanceOf[js.Any], El.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def add_=(x: js.Function4[/* Ah */ Double, /* Al */ Double, /* Bh */ Double, /* Bl */ Double, H]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("add")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/hashes/_u64", "default.fromBig")
    @js.native
    def fromBig: js.Function2[/* n */ js.BigInt, /* le */ js.UndefOr[Boolean], H] = js.native
    inline def fromBig(n: js.BigInt): H = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBig")(n.asInstanceOf[js.Any]).asInstanceOf[H]
    inline def fromBig(n: js.BigInt, le: Boolean): H = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBig")(n.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[H]
    inline def fromBig_=(x: js.Function2[/* n */ js.BigInt, /* le */ js.UndefOr[Boolean], H]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromBig")(x.asInstanceOf[js.Any])
    
    inline def rotlBH(h: Double, l: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotlBH")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def rotlBL(h: Double, l: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotlBL")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def rotlSH(h: Double, l: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotlSH")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def rotlSL(h: Double, l: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotlSL")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def rotr32H(h: Double, l: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotr32H")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def rotr32L(h: Double, l: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotr32L")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def rotrBH(h: Double, l: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotrBH")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def rotrBL(h: Double, l: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotrBL")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def rotrSH(h: Double, l: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotrSH")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def rotrSL(h: Double, l: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotrSL")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def shrSH(h: Double, l: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("shrSH")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def shrSL(h: Double, l: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("shrSL")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("@noble/hashes/_u64", "default.split")
    @js.native
    def split: js.Function2[
        /* lst */ js.Array[js.BigInt], 
        /* le */ js.UndefOr[Boolean], 
        js.Array[js.typedarray.Uint32Array]
      ] = js.native
    inline def split(lst: js.Array[js.BigInt]): js.Array[js.typedarray.Uint32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(lst.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.typedarray.Uint32Array]]
    inline def split(lst: js.Array[js.BigInt], le: Boolean): js.Array[js.typedarray.Uint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(lst.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.typedarray.Uint32Array]]
    inline def split_=(
      x: js.Function2[
          /* lst */ js.Array[js.BigInt], 
          /* le */ js.UndefOr[Boolean], 
          js.Array[js.typedarray.Uint32Array]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("split")(x.asInstanceOf[js.Any])
    
    inline def toBig(h: Double, l: Double): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("toBig")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  }
  
  inline def add(Ah: Double, Al: Double, Bh: Double, Bl: Double): H = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(Ah.asInstanceOf[js.Any], Al.asInstanceOf[js.Any], Bh.asInstanceOf[js.Any], Bl.asInstanceOf[js.Any])).asInstanceOf[H]
  
  inline def fromBig(n: js.BigInt): H = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBig")(n.asInstanceOf[js.Any]).asInstanceOf[H]
  inline def fromBig(n: js.BigInt, le: Boolean): H = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBig")(n.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[H]
  
  inline def split(lst: js.Array[js.BigInt]): js.Array[js.typedarray.Uint32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(lst.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.typedarray.Uint32Array]]
  inline def split(lst: js.Array[js.BigInt], le: Boolean): js.Array[js.typedarray.Uint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(lst.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.typedarray.Uint32Array]]
  
  inline def toBig(h: Double, l: Double): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("toBig")(h.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
}
