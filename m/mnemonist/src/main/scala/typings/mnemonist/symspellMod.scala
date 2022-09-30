package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symspellMod {
  
  @JSImport("mnemonist/symspell", JSImport.Default)
  @js.native
  // Constructor
  open class default ()
    extends StObject
       with SymSpell {
    def this(options: SymSpellOptions) = this()
    
    /* CompleteClass */
    override def add(string: String): this.type = js.native
    
    // Methods
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def search(query: String): js.Array[SymSpellMatch] = js.native
    
    // Members
    /* CompleteClass */
    var size: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/symspell", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from(strings: js.Iterable[String]): SymSpell = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(strings.asInstanceOf[js.Any]).asInstanceOf[SymSpell]
    inline def from(strings: js.Iterable[String], options: SymSpellOptions): SymSpell = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(strings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SymSpell]
    inline def from(strings: StringDictionary[String]): SymSpell = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(strings.asInstanceOf[js.Any]).asInstanceOf[SymSpell]
    inline def from(strings: StringDictionary[String], options: SymSpellOptions): SymSpell = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(strings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SymSpell]
  }
  
  trait SymSpell extends StObject {
    
    def add(string: String): this.type
    
    // Methods
    def clear(): Unit
    
    def search(query: String): js.Array[SymSpellMatch]
    
    // Members
    var size: Double
  }
  object SymSpell {
    
    inline def apply(
      add: String => SymSpell,
      clear: () => Unit,
      search: String => js.Array[SymSpellMatch],
      size: Double
    ): SymSpell = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), search = js.Any.fromFunction1(search), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymSpell]
    }
    
    extension [Self <: SymSpell](x: Self) {
      
      inline def setAdd(value: String => SymSpell): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setSearch(value: String => js.Array[SymSpellMatch]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait SymSpellMatch extends StObject {
    
    var count: Double
    
    var distance: Double
    
    var term: String
  }
  object SymSpellMatch {
    
    inline def apply(count: Double, distance: Double, term: String): SymSpellMatch = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymSpellMatch]
    }
    
    extension [Self <: SymSpellMatch](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
  
  trait SymSpellOptions extends StObject {
    
    var maxDistance: js.UndefOr[Double] = js.undefined
    
    var verbosity: js.UndefOr[SymSpellVerbosity] = js.undefined
  }
  object SymSpellOptions {
    
    inline def apply(): SymSpellOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymSpellOptions]
    }
    
    extension [Self <: SymSpellOptions](x: Self) {
      
      inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
      
      inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
      
      inline def setVerbosity(value: SymSpellVerbosity): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
      
      inline def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mnemonist.mnemonistInts.`0`
    - typings.mnemonist.mnemonistInts.`1`
    - typings.mnemonist.mnemonistInts.`2`
  */
  trait SymSpellVerbosity extends StObject
  object SymSpellVerbosity {
    
    inline def `0`: typings.mnemonist.mnemonistInts.`0` = 0.asInstanceOf[typings.mnemonist.mnemonistInts.`0`]
    
    inline def `1`: typings.mnemonist.mnemonistInts.`1` = 1.asInstanceOf[typings.mnemonist.mnemonistInts.`1`]
    
    inline def `2`: typings.mnemonist.mnemonistInts.`2` = 2.asInstanceOf[typings.mnemonist.mnemonistInts.`2`]
  }
}
