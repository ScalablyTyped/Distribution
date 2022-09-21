package typings.orderedBinary

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ordered-binary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ordered-binary", "MAXIMUM_KEY")
  @js.native
  val MAXIMUM_KEY: js.typedarray.Uint8Array = js.native
  
  @JSImport("ordered-binary", "MINIMUM_KEY")
  @js.native
  val MINIMUM_KEY: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  inline def compareKeys(a: Key, b: Key): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareKeys")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def enableNullTermination(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNullTermination")().asInstanceOf[Unit]
  
  object encoder {
    
    @JSImport("ordered-binary", "encoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enableNullTermination(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNullTermination")().asInstanceOf[Unit]
    @JSImport("ordered-binary", "encoder.enableNullTermination")
    @js.native
    def enableNullTermination_Fencoder: js.Function0[Unit] = js.native
    
    inline def enableNullTermination_Fencoder_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableNullTermination")(x.asInstanceOf[js.Any])
    
    @JSImport("ordered-binary", "encoder.readKey")
    @js.native
    def readKey: js.Function4[
        /* buffer */ js.typedarray.Uint8Array, 
        /* start */ Double, 
        /* end */ js.UndefOr[Double], 
        /* inSequence */ js.UndefOr[Boolean], 
        Key
      ] = js.native
    inline def readKey(buffer: js.typedarray.Uint8Array, start: Double): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("readKey")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Key]
    inline def readKey(buffer: js.typedarray.Uint8Array, start: Double, end: Double): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("readKey")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Key]
    inline def readKey(buffer: js.typedarray.Uint8Array, start: Double, end: Double, inSequence: Boolean): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("readKey")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inSequence.asInstanceOf[js.Any])).asInstanceOf[Key]
    inline def readKey(buffer: js.typedarray.Uint8Array, start: Double, end: Unit, inSequence: Boolean): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("readKey")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inSequence.asInstanceOf[js.Any])).asInstanceOf[Key]
    inline def readKey_=(
      x: js.Function4[
          /* buffer */ js.typedarray.Uint8Array, 
          /* start */ Double, 
          /* end */ js.UndefOr[Double], 
          /* inSequence */ js.UndefOr[Boolean], 
          Key
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readKey")(x.asInstanceOf[js.Any])
    
    @JSImport("ordered-binary", "encoder.writeKey")
    @js.native
    def writeKey: js.Function4[
        /* key */ Key, 
        /* target */ js.typedarray.Uint8Array, 
        /* position */ Double, 
        /* inSequence */ js.UndefOr[Boolean], 
        Double
      ] = js.native
    inline def writeKey(key: Key, target: js.typedarray.Uint8Array, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeKey")(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeKey(key: Key, target: js.typedarray.Uint8Array, position: Double, inSequence: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeKey")(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], position.asInstanceOf[js.Any], inSequence.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeKey_=(
      x: js.Function4[
          /* key */ Key, 
          /* target */ js.typedarray.Uint8Array, 
          /* position */ Double, 
          /* inSequence */ js.UndefOr[Boolean], 
          Double
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeKey")(x.asInstanceOf[js.Any])
  }
  
  inline def fromBufferKey(source: Buffer): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBufferKey")(source.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  inline def readKey(buffer: js.typedarray.Uint8Array, start: Double): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("readKey")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def readKey(buffer: js.typedarray.Uint8Array, start: Double, end: Double): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("readKey")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def readKey(buffer: js.typedarray.Uint8Array, start: Double, end: Double, inSequence: Boolean): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("readKey")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inSequence.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def readKey(buffer: js.typedarray.Uint8Array, start: Double, end: Unit, inSequence: Boolean): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("readKey")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inSequence.asInstanceOf[js.Any])).asInstanceOf[Key]
  
  inline def toBufferKey(key: Key): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBufferKey")(key.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def writeKey(key: Key, target: js.typedarray.Uint8Array, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeKey")(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeKey(key: Key, target: js.typedarray.Uint8Array, position: Double, inSequence: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeKey")(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], position.asInstanceOf[js.Any], inSequence.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type Key = js.Array[Any] | String | js.Symbol | Double | Boolean | js.typedarray.Uint8Array
}
