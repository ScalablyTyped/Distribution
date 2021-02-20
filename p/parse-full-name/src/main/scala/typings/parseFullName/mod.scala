package typings.parseFullName

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(nameToParse: String): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(
    nameToParse: String,
    partToReturn: js.UndefOr[scala.Nothing],
    fixCase: js.UndefOr[scala.Nothing],
    stopOnError: js.UndefOr[scala.Nothing],
    useLongLists: Boolean
  ): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(
    nameToParse: String,
    partToReturn: js.UndefOr[scala.Nothing],
    fixCase: js.UndefOr[scala.Nothing],
    stopOnError: Boolean
  ): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(
    nameToParse: String,
    partToReturn: js.UndefOr[scala.Nothing],
    fixCase: js.UndefOr[scala.Nothing],
    stopOnError: Boolean,
    useLongLists: Boolean
  ): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(nameToParse: String, partToReturn: js.UndefOr[scala.Nothing], fixCase: Boolean): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(
    nameToParse: String,
    partToReturn: js.UndefOr[scala.Nothing],
    fixCase: Boolean,
    stopOnError: js.UndefOr[scala.Nothing],
    useLongLists: Boolean
  ): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(
    nameToParse: String,
    partToReturn: js.UndefOr[scala.Nothing],
    fixCase: Boolean,
    stopOnError: Boolean
  ): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(
    nameToParse: String,
    partToReturn: js.UndefOr[scala.Nothing],
    fixCase: Boolean,
    stopOnError: Boolean,
    useLongLists: Boolean
  ): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(nameToParse: String, partToReturn: partToReturn): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(
    nameToParse: String,
    partToReturn: partToReturn,
    fixCase: js.UndefOr[scala.Nothing],
    stopOnError: js.UndefOr[scala.Nothing],
    useLongLists: Boolean
  ): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(
    nameToParse: String,
    partToReturn: partToReturn,
    fixCase: js.UndefOr[scala.Nothing],
    stopOnError: Boolean
  ): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(
    nameToParse: String,
    partToReturn: partToReturn,
    fixCase: js.UndefOr[scala.Nothing],
    stopOnError: Boolean,
    useLongLists: Boolean
  ): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(nameToParse: String, partToReturn: partToReturn, fixCase: Boolean): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(
    nameToParse: String,
    partToReturn: partToReturn,
    fixCase: Boolean,
    stopOnError: js.UndefOr[scala.Nothing],
    useLongLists: Boolean
  ): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(nameToParse: String, partToReturn: partToReturn, fixCase: Boolean, stopOnError: Boolean): Name = js.native
  @JSImport("parse-full-name", "parseFullName")
  @js.native
  def parseFullName(
    nameToParse: String,
    partToReturn: partToReturn,
    fixCase: Boolean,
    stopOnError: Boolean,
    useLongLists: Boolean
  ): Name = js.native
  
  @js.native
  trait Name extends StObject {
    
    var error: js.UndefOr[js.Array[js.Any]] = js.native
    
    var first: js.UndefOr[String] = js.native
    
    var last: js.UndefOr[String] = js.native
    
    var middle: js.UndefOr[String] = js.native
    
    var nick: js.UndefOr[String] = js.native
    
    var suffix: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Array[js.Any]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setErrorVarargs(value: js.Any*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      @scala.inline
      def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      @scala.inline
      def setMiddle(value: String): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
      
      @scala.inline
      def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNickUndefined: Self = StObject.set(x, "nick", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
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
    
    @scala.inline
    def all: typings.parseFullName.parseFullNameStrings.all = "all".asInstanceOf[typings.parseFullName.parseFullNameStrings.all]
    
    @scala.inline
    def error: typings.parseFullName.parseFullNameStrings.error = "error".asInstanceOf[typings.parseFullName.parseFullNameStrings.error]
    
    @scala.inline
    def first: typings.parseFullName.parseFullNameStrings.first = "first".asInstanceOf[typings.parseFullName.parseFullNameStrings.first]
    
    @scala.inline
    def last: typings.parseFullName.parseFullNameStrings.last = "last".asInstanceOf[typings.parseFullName.parseFullNameStrings.last]
    
    @scala.inline
    def middle: typings.parseFullName.parseFullNameStrings.middle = "middle".asInstanceOf[typings.parseFullName.parseFullNameStrings.middle]
    
    @scala.inline
    def nick: typings.parseFullName.parseFullNameStrings.nick = "nick".asInstanceOf[typings.parseFullName.parseFullNameStrings.nick]
    
    @scala.inline
    def suffix: typings.parseFullName.parseFullNameStrings.suffix = "suffix".asInstanceOf[typings.parseFullName.parseFullNameStrings.suffix]
    
    @scala.inline
    def title: typings.parseFullName.parseFullNameStrings.title = "title".asInstanceOf[typings.parseFullName.parseFullNameStrings.title]
  }
}
