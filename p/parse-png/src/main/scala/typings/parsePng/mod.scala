package typings.parsePng

import typings.node.bufferMod.global.Buffer
import typings.pngjs.mod.Metadata
import typings.pngjs.mod.PNG
import typings.pngjs.mod.PNGOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Parse a PNG.
  @param buffer - A PNG image buffer.
  @param options - See the [pngjs options](https://github.com/lukeapage/pngjs#options).
  @returns The parsed PNG image.
  @example
  ```
  import * as fs from 'fs';
  import parsePng = require('parse-png');
  (async () => {
  	const png = await parsePng(fs.readFileSync('unicorn.png'));
  	png.adjustGamma();
  	png.pack().pipe(fs.createWriteStream('unicorn-adjusted.png'));
  })();
  ```
  */
  inline def apply(buffer: Buffer): js.Promise[PNG & Metadata] = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PNG & Metadata]]
  inline def apply(buffer: Buffer, options: PNGOptions): js.Promise[PNG & Metadata] = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PNG & Metadata]]
  
  @JSImport("parse-png", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
