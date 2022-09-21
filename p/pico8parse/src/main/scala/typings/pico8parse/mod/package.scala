package typings.pico8parse.mod

import typings.pico8parse.anon.PartialOptions
import typings.pico8parse.anon.PartialOptionswaittrue
import typings.pico8parse.mod.^
import typings.pico8parse.mod.ast.Chunk_
import typings.pico8parse.mod.ast.Token
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def end: js.Function1[/* segment */ js.UndefOr[String], Chunk_] = ^.asInstanceOf[js.Dynamic].selectDynamic("end").asInstanceOf[js.Function1[/* segment */ js.UndefOr[String], Chunk_]]

inline def errors: Record[String, String] = ^.asInstanceOf[js.Dynamic].selectDynamic("errors").asInstanceOf[Record[String, String]]

inline def lex: js.Function0[Token] = ^.asInstanceOf[js.Dynamic].selectDynamic("lex").asInstanceOf[js.Function0[Token]]

inline def parse(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Parser]
inline def parse(code: String): Chunk_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[Chunk_]
inline def parse(code: String, options: PartialOptions): Chunk_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chunk_]
inline def parse(code: String, options: PartialOptionswaittrue): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
inline def parse(options: PartialOptions): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def write: js.Function1[/* segment */ String, Parser] = ^.asInstanceOf[js.Dynamic].selectDynamic("write").asInstanceOf[js.Function1[/* segment */ String, Parser]]
