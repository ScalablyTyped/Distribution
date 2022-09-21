package typings.minizlib

import typings.minizlib.mod.BrotliMode
import typings.minizlib.mod.ZlibMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minizlibStrings {
  
  @js.native
  sealed trait BrotliCompress
    extends StObject
       with BrotliMode
  inline def BrotliCompress: BrotliCompress = "BrotliCompress".asInstanceOf[BrotliCompress]
  
  @js.native
  sealed trait BrotliDecompress
    extends StObject
       with BrotliMode
  inline def BrotliDecompress: BrotliDecompress = "BrotliDecompress".asInstanceOf[BrotliDecompress]
  
  @js.native
  sealed trait Deflate
    extends StObject
       with ZlibMode
  inline def Deflate: Deflate = "Deflate".asInstanceOf[Deflate]
  
  @js.native
  sealed trait DeflateRaw
    extends StObject
       with ZlibMode
  inline def DeflateRaw: DeflateRaw = "DeflateRaw".asInstanceOf[DeflateRaw]
  
  @js.native
  sealed trait Gunzip
    extends StObject
       with ZlibMode
  inline def Gunzip: Gunzip = "Gunzip".asInstanceOf[Gunzip]
  
  @js.native
  sealed trait Gzip
    extends StObject
       with ZlibMode
  inline def Gzip: Gzip = "Gzip".asInstanceOf[Gzip]
  
  @js.native
  sealed trait Inflate
    extends StObject
       with ZlibMode
  inline def Inflate: Inflate = "Inflate".asInstanceOf[Inflate]
  
  @js.native
  sealed trait InflateRaw
    extends StObject
       with ZlibMode
  inline def InflateRaw: InflateRaw = "InflateRaw".asInstanceOf[InflateRaw]
  
  @js.native
  sealed trait Unzip
    extends StObject
       with ZlibMode
  inline def Unzip: Unzip = "Unzip".asInstanceOf[Unzip]
  
  @js.native
  sealed trait buffer extends StObject
  inline def buffer: buffer = "buffer".asInstanceOf[buffer]
}
