package typings.nobleHashes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertMod {
  
  @JSImport("@noble/hashes/_assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@noble/hashes/_assert", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/_assert", "default.bool")
    @js.native
    def bool: js.Function1[/* b */ Boolean, Unit] = js.native
    inline def bool(b: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(b.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def bool_=(x: js.Function1[/* b */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/hashes/_assert", "default.bytes")
    @js.native
    def bytes: js.Function2[/* b */ js.UndefOr[js.typedarray.Uint8Array], /* repeated */ Double, Unit] = js.native
    inline def bytes(b: js.typedarray.Uint8Array, lengths: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes")(scala.List(b.asInstanceOf[js.Any]).`++`(lengths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def bytes(b: Unit, lengths: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes")(scala.List(b.asInstanceOf[js.Any]).`++`(lengths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def bytes_=(x: js.Function2[/* b */ js.UndefOr[js.typedarray.Uint8Array], /* repeated */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytes")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/hashes/_assert", "default.exists")
    @js.native
    def exists: js.Function2[/* instance */ Any, /* checkFinished */ js.UndefOr[Boolean], Unit] = js.native
    inline def exists(instance: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def exists(instance: Any, checkFinished: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(instance.asInstanceOf[js.Any], checkFinished.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def exists_=(x: js.Function2[/* instance */ Any, /* checkFinished */ js.UndefOr[Boolean], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exists")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/hashes/_assert", "default.hash")
    @js.native
    def hash: js.Function1[/* hash */ Hash_, Unit] = js.native
    inline def hash(hash: Hash_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(hash.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def hash_=(x: js.Function1[/* hash */ Hash_, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/hashes/_assert", "default.number")
    @js.native
    def number: Double = js.native
    inline def number_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/hashes/_assert", "default.output")
    @js.native
    def output: js.Function2[/* out */ Any, /* instance */ Any, Unit] = js.native
    inline def output(out: Any, instance: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(out.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def output_=(x: js.Function2[/* out */ Any, /* instance */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("output")(x.asInstanceOf[js.Any])
  }
  
  inline def bool(b: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(b.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def bytes(b: js.typedarray.Uint8Array, lengths: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes")(scala.List(b.asInstanceOf[js.Any]).`++`(lengths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def bytes(b: Unit, lengths: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes")(scala.List(b.asInstanceOf[js.Any]).`++`(lengths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def exists(instance: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exists(instance: Any, checkFinished: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(instance.asInstanceOf[js.Any], checkFinished.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hash(hash: Hash_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(hash.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def number(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def output(out: Any, instance: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(out.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Hash_ extends StObject {
    
    def apply(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    var blockLen: Double = js.native
    
    var create: Any = js.native
    
    var outputLen: Double = js.native
  }
}
