package typings.nodeZopfli

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-zopfli", JSImport.Namespace)
  @js.native
  class ^ () extends Transform {
    def this(format: Format) = this()
    def this(format: Unit, options: Options) = this()
    def this(format: Format, options: Options) = this()
  }
  @JSImport("node-zopfli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def compress(input: Buffer, format: Format): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  /* static member */
  @scala.inline
  def compress(input: Buffer, format: Format, cb: js.Function2[/* err */ Error, /* out */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(input: Buffer, format: Format, options: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  /* static member */
  @scala.inline
  def compress(
    input: Buffer,
    format: Format,
    options: Options,
    cb: js.Function2[/* err */ Error, /* out */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def createDeflate(): Zopfli = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflate")().asInstanceOf[Zopfli]
  @scala.inline
  def createDeflate(options: Options): Zopfli = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflate")(options.asInstanceOf[js.Any]).asInstanceOf[Zopfli]
  
  /* static member */
  @scala.inline
  def createGzip(): Zopfli = ^.asInstanceOf[js.Dynamic].applyDynamic("createGzip")().asInstanceOf[Zopfli]
  @scala.inline
  def createGzip(options: Options): Zopfli = ^.asInstanceOf[js.Dynamic].applyDynamic("createGzip")(options.asInstanceOf[js.Any]).asInstanceOf[Zopfli]
  
  /* static member */
  @scala.inline
  def createZlib(): Zopfli = ^.asInstanceOf[js.Dynamic].applyDynamic("createZlib")().asInstanceOf[Zopfli]
  @scala.inline
  def createZlib(options: Options): Zopfli = ^.asInstanceOf[js.Dynamic].applyDynamic("createZlib")(options.asInstanceOf[js.Any]).asInstanceOf[Zopfli]
  
  /* static member */
  @scala.inline
  def deflate(input: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  /* static member */
  @scala.inline
  def deflate(input: Buffer, cb: js.Function2[/* err */ Error, /* out */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def deflate(input: Buffer, options: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  /* static member */
  @scala.inline
  def deflate(input: Buffer, options: Options, cb: js.Function2[/* err */ Error, /* out */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def deflateSync(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")().asInstanceOf[Buffer]
  @scala.inline
  def deflateSync(options: Options): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /* static member */
  @scala.inline
  def gzip(input: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  /* static member */
  @scala.inline
  def gzip(input: Buffer, cb: js.Function2[/* err */ Error, /* out */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def gzip(input: Buffer, options: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  /* static member */
  @scala.inline
  def gzip(input: Buffer, options: Options, cb: js.Function2[/* err */ Error, /* out */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def gzipSync(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")().asInstanceOf[Buffer]
  @scala.inline
  def gzipSync(options: Options): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /* static member */
  @scala.inline
  def zlib(input: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("zlib")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  /* static member */
  @scala.inline
  def zlib(input: Buffer, cb: js.Function2[/* err */ Error, /* out */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zlib")(input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def zlib(input: Buffer, options: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("zlib")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  /* static member */
  @scala.inline
  def zlib(input: Buffer, options: Options, cb: js.Function2[/* err */ Error, /* out */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zlib")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def zlibSync(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("zlibSync")().asInstanceOf[Buffer]
  @scala.inline
  def zlibSync(options: Options): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("zlibSync")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeZopfli.nodeZopfliStrings.deflate
    - typings.nodeZopfli.nodeZopfliStrings.gzip
    - typings.nodeZopfli.nodeZopfliStrings.zlib
  */
  trait Format extends StObject
  object Format {
    
    @scala.inline
    def deflate: typings.nodeZopfli.nodeZopfliStrings.deflate = "deflate".asInstanceOf[typings.nodeZopfli.nodeZopfliStrings.deflate]
    
    @scala.inline
    def gzip: typings.nodeZopfli.nodeZopfliStrings.gzip = "gzip".asInstanceOf[typings.nodeZopfli.nodeZopfliStrings.gzip]
    
    @scala.inline
    def zlib: typings.nodeZopfli.nodeZopfliStrings.zlib = "zlib".asInstanceOf[typings.nodeZopfli.nodeZopfliStrings.zlib]
  }
  
  trait Options extends StObject {
    
    /**
      * If true, splits the data in multiple deflate blocks with optimal choice for the block boundaries.
      * Block splitting gives better compression.
      */
    var blocksplitting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, chooses the optimal block split points only after doing the iterative LZ77 compression.
      * If false, chooses the block split points first, then does iterative LZ77 on each individual block.
      * Depending on the file, either first or last gives the best compression.
      */
    var blocksplittinglast: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum amount of blocks to split into (0 for unlimited,
      * but this can give extreme results that hurt compression on some files).
      */
    var blocksplittingmax: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum amount of times to rerun forward and backward pass to optimize LZ77 compression cost.
      * Good values: 10, 15 for small files, 5 for files over several MB in size or it will be too slow.
      */
    var numiterations: js.UndefOr[Double] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var verbose_more: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocksplitting(value: Boolean): Self = StObject.set(x, "blocksplitting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksplittingUndefined: Self = StObject.set(x, "blocksplitting", js.undefined)
      
      @scala.inline
      def setBlocksplittinglast(value: Boolean): Self = StObject.set(x, "blocksplittinglast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksplittinglastUndefined: Self = StObject.set(x, "blocksplittinglast", js.undefined)
      
      @scala.inline
      def setBlocksplittingmax(value: Double): Self = StObject.set(x, "blocksplittingmax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksplittingmaxUndefined: Self = StObject.set(x, "blocksplittingmax", js.undefined)
      
      @scala.inline
      def setNumiterations(value: Double): Self = StObject.set(x, "numiterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumiterationsUndefined: Self = StObject.set(x, "numiterations", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setVerbose_more(value: Boolean): Self = StObject.set(x, "verbose_more", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose_moreUndefined: Self = StObject.set(x, "verbose_more", js.undefined)
    }
  }
  
  type Zopfli = Transform
}
