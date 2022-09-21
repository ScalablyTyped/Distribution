package typings.multiformats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashesInterfaceMod {
  
  trait MultihashDigest[Code /* <: Double */] extends StObject {
    
    /**
      * Binary representation of this multihash digest.
      */
    var bytes: js.typedarray.Uint8Array
    
    /**
      * Code of the multihash
      */
    var code: Code
    
    /**
      * Raw digest (without a hashing algorithm info)
      */
    var digest: js.typedarray.Uint8Array
    
    /**
      * byte length of the `this.digest`
      */
    var size: Double
  }
  object MultihashDigest {
    
    inline def apply[Code /* <: Double */](bytes: js.typedarray.Uint8Array, code: Code, digest: js.typedarray.Uint8Array, size: Double): MultihashDigest[Code] = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultihashDigest[Code]]
    }
    
    extension [Self <: MultihashDigest[?], Code /* <: Double */](x: Self & MultihashDigest[Code]) {
      
      inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDigest(value: js.typedarray.Uint8Array): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultihashHasher[Code /* <: Double */] extends StObject {
    
    /**
      * Code of the multihash
      */
    var code: Code
    
    /**
      * Takes binary `input` and returns it (multi) hash digest. Return value is
      * either promise of a digest or a digest. This way general use can `await`
      * while performance critical code may asses return value to decide whether
      * await is needed.
      *
      * @param {Uint8Array} input
      */
    def digest(input: js.typedarray.Uint8Array): js.Promise[MultihashDigest[Double]] | MultihashDigest[Double]
    
    /**
      * Name of the multihash
      */
    var name: String
  }
  object MultihashHasher {
    
    inline def apply[Code /* <: Double */](
      code: Code,
      digest: js.typedarray.Uint8Array => js.Promise[MultihashDigest[Double]] | MultihashDigest[Double],
      name: String
    ): MultihashHasher[Code] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], digest = js.Any.fromFunction1(digest), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultihashHasher[Code]]
    }
    
    extension [Self <: MultihashHasher[?], Code /* <: Double */](x: Self & MultihashHasher[Code]) {
      
      inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDigest(value: js.typedarray.Uint8Array => js.Promise[MultihashDigest[Double]] | MultihashDigest[Double]): Self = StObject.set(x, "digest", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncMultihashHasher[Code /* <: Double */]
    extends StObject
       with MultihashHasher[Code]
  object SyncMultihashHasher {
    
    inline def apply[Code /* <: Double */](
      code: Code,
      digest: js.typedarray.Uint8Array => js.Promise[MultihashDigest[Double]] | MultihashDigest[Double],
      name: String
    ): SyncMultihashHasher[Code] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], digest = js.Any.fromFunction1(digest), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMultihashHasher[Code]]
    }
  }
}
