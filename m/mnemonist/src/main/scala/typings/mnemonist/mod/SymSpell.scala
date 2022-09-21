package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.symspellMod.SymSpellOptions
import typings.mnemonist.symspellMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "SymSpell")
@js.native
// Constructor
open class SymSpell () extends default {
  def this(options: SymSpellOptions) = this()
}
/* static members */
object SymSpell {
  
  @JSImport("mnemonist", "SymSpell")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from(strings: js.Iterable[String]): typings.mnemonist.symspellMod.SymSpell = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(strings.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.symspellMod.SymSpell]
  inline def from(strings: js.Iterable[String], options: SymSpellOptions): typings.mnemonist.symspellMod.SymSpell = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(strings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.symspellMod.SymSpell]
  inline def from(strings: StringDictionary[String]): typings.mnemonist.symspellMod.SymSpell = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(strings.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.symspellMod.SymSpell]
  inline def from(strings: StringDictionary[String], options: SymSpellOptions): typings.mnemonist.symspellMod.SymSpell = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(strings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.symspellMod.SymSpell]
}
