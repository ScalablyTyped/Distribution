package typings.parseFullName

import typings.parseFullName.parseFullNameNumbers.`-1`
import typings.parseFullName.parseFullNameNumbers.`0`
import typings.parseFullName.parseFullNameNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-full-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseFullName(
    nameToParse: String,
    partToReturn: js.UndefOr[partToReturn],
    fixCase: js.UndefOr[Boolean | `-1` | `0` | `1`],
    stopOnError: js.UndefOr[Boolean | `0` | `1`],
    useLongLists: js.UndefOr[Boolean | `0` | `1`]
  ): Name = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFullName")(nameToParse.asInstanceOf[js.Any], partToReturn.asInstanceOf[js.Any], fixCase.asInstanceOf[js.Any], stopOnError.asInstanceOf[js.Any], useLongLists.asInstanceOf[js.Any])).asInstanceOf[Name]
  
  trait Name extends StObject {
    
    var error: js.UndefOr[js.Array[Any]] = js.undefined
    
    var first: js.UndefOr[String] = js.undefined
    
    var last: js.UndefOr[String] = js.undefined
    
    var middle: js.UndefOr[String] = js.undefined
    
    var nick: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setError(value: js.Array[Any]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrorVarargs(value: Any*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setMiddle(value: String): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      inline def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
      
      inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
      
      inline def setNickUndefined: Self = StObject.set(x, "nick", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parseFullName.parseFullNameStrings.title
    - typings.parseFullName.parseFullNameStrings.first
    - typings.parseFullName.parseFullNameStrings.middle
    - typings.parseFullName.parseFullNameStrings.last
    - typings.parseFullName.parseFullNameStrings.nick
    - typings.parseFullName.parseFullNameStrings.suffix
    - typings.parseFullName.parseFullNameStrings.error
    - typings.parseFullName.parseFullNameStrings.all
  */
  trait partToReturn extends StObject
  object partToReturn {
    
    inline def all: typings.parseFullName.parseFullNameStrings.all = "all".asInstanceOf[typings.parseFullName.parseFullNameStrings.all]
    
    inline def error: typings.parseFullName.parseFullNameStrings.error = "error".asInstanceOf[typings.parseFullName.parseFullNameStrings.error]
    
    inline def first: typings.parseFullName.parseFullNameStrings.first = "first".asInstanceOf[typings.parseFullName.parseFullNameStrings.first]
    
    inline def last: typings.parseFullName.parseFullNameStrings.last = "last".asInstanceOf[typings.parseFullName.parseFullNameStrings.last]
    
    inline def middle: typings.parseFullName.parseFullNameStrings.middle = "middle".asInstanceOf[typings.parseFullName.parseFullNameStrings.middle]
    
    inline def nick: typings.parseFullName.parseFullNameStrings.nick = "nick".asInstanceOf[typings.parseFullName.parseFullNameStrings.nick]
    
    inline def suffix: typings.parseFullName.parseFullNameStrings.suffix = "suffix".asInstanceOf[typings.parseFullName.parseFullNameStrings.suffix]
    
    inline def title: typings.parseFullName.parseFullNameStrings.title = "title".asInstanceOf[typings.parseFullName.parseFullNameStrings.title]
  }
}
