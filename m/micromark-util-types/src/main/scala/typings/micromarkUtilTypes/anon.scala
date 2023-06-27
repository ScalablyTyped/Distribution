package typings.micromarkUtilTypes

import typings.micromarkUtilTypes.micromarkUtilTypesStrings.characterReferenceType
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.definitions
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.expectFirstItem
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.fencedCodeInside
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.fencesCount
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.flowCodeSeenData
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.headingRank
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.ignoreEncode
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.inCodeText
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.lastWasTag
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.slurpAllLineEndings
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.slurpOneLineEnding
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.tightStack
import typings.micromarkUtilTypes.mod.Code
import typings.micromarkUtilTypes.mod.CompileOptions
import typings.micromarkUtilTypes.mod.ContentType
import typings.micromarkUtilTypes.mod.Event
import typings.micromarkUtilTypes.mod.Point
import typings.micromarkUtilTypes.mod.Resolver
import typings.micromarkUtilTypes.mod.Token
import typings.micromarkUtilTypes.mod.TokenizeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `null`: js.UndefOr[js.Array[PickConstructresolveAll]] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setNull(value: js.Array[PickConstructresolveAll]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
      
      inline def setNullVarargs(value: PickConstructresolveAll*): Self = StObject.set(x, "null", js.Array(value*))
    }
  }
  
  trait `1` extends StObject {
    
    var `null`: js.UndefOr[js.Array[Code]] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setNull(value: js.Array[Code]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
      
      inline def setNullVarargs(value: Code*): Self = StObject.set(x, "null", js.Array(value*))
    }
  }
  
  trait Null extends StObject {
    
    var `null`: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Null {
    
    inline def apply(): Null = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Null]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Null] (val x: Self) extends AnyVal {
      
      inline def setNull(value: js.Array[String]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
      
      inline def setNullVarargs(value: String*): Self = StObject.set(x, "null", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<micromark-util-types.micromark-util-types.CompileContext, 'sliceSerialize'> */
  trait OmitCompileContextsliceSe extends StObject {
    
    def buffer(): Unit
    @JSName("buffer")
    var buffer_Original: js.Function0[Unit]
    
    def encode(value: String): String
    @JSName("encode")
    var encode_Original: js.Function1[/* value */ String, String]
    
    def getData[Key /* <: lastWasTag | expectFirstItem | slurpOneLineEnding | slurpAllLineEndings | fencedCodeInside | fencesCount | flowCodeSeenData | ignoreEncode | headingRank | inCodeText | characterReferenceType | tightStack | definitions */](key: Key): /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData[Key] */ js.Any
    @JSName("getData")
    var getData_Original: js.Function1[
        /* key */ lastWasTag | expectFirstItem | slurpOneLineEnding | slurpAllLineEndings | fencedCodeInside | fencesCount | flowCodeSeenData | ignoreEncode | headingRank | inCodeText | characterReferenceType | tightStack | definitions, 
        /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData['lastWasTag' | 'expectFirstItem' | 'slurpOneLineEnding' | 'slurpAllLineEndings' | 'fencedCodeInside' | 'fencesCount' | 'flowCodeSeenData' | 'ignoreEncode' | 'headingRank' | 'inCodeText' | 'characterReferenceType' | 'tightStack' | 'definitions'] */ js.Any
      ]
    
    def lineEndingIfNeeded(): Unit
    @JSName("lineEndingIfNeeded")
    var lineEndingIfNeeded_Original: js.Function0[Unit]
    
    var options: CompileOptions
    
    def raw(value: String): Unit
    @JSName("raw")
    var raw_Original: js.Function1[/* value */ String, Unit]
    
    def resume(): String
    @JSName("resume")
    var resume_Original: js.Function0[String]
    
    def setData[Key /* <: lastWasTag | expectFirstItem | slurpOneLineEnding | slurpAllLineEndings | fencedCodeInside | fencesCount | flowCodeSeenData | ignoreEncode | headingRank | inCodeText | characterReferenceType | tightStack | definitions */](key: Key): Unit
    def setData[Key /* <: lastWasTag | expectFirstItem | slurpOneLineEnding | slurpAllLineEndings | fencedCodeInside | fencesCount | flowCodeSeenData | ignoreEncode | headingRank | inCodeText | characterReferenceType | tightStack | definitions */](
      key: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData[Key] */ js.Any
    ): Unit
    @JSName("setData")
    var setData_Original: js.Function2[
        /* key */ lastWasTag | expectFirstItem | slurpOneLineEnding | slurpAllLineEndings | fencedCodeInside | fencesCount | flowCodeSeenData | ignoreEncode | headingRank | inCodeText | characterReferenceType | tightStack | definitions, 
        /* value */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData['lastWasTag' | 'expectFirstItem' | 'slurpOneLineEnding' | 'slurpAllLineEndings' | 'fencedCodeInside' | 'fencesCount' | 'flowCodeSeenData' | 'ignoreEncode' | 'headingRank' | 'inCodeText' | 'characterReferenceType' | 'tightStack' | 'definitions'] */ js.Any
        ], 
        Unit
      ]
    
    def tag(value: String): Unit
    @JSName("tag")
    var tag_Original: js.Function1[/* value */ String, Unit]
  }
  object OmitCompileContextsliceSe {
    
    inline def apply(
      buffer: () => Unit,
      encode: /* value */ String => String,
      getData: /* key */ lastWasTag | expectFirstItem | slurpOneLineEnding | slurpAllLineEndings | fencedCodeInside | fencesCount | flowCodeSeenData | ignoreEncode | headingRank | inCodeText | characterReferenceType | tightStack | definitions => /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData['lastWasTag' | 'expectFirstItem' | 'slurpOneLineEnding' | 'slurpAllLineEndings' | 'fencedCodeInside' | 'fencesCount' | 'flowCodeSeenData' | 'ignoreEncode' | 'headingRank' | 'inCodeText' | 'characterReferenceType' | 'tightStack' | 'definitions'] */ js.Any,
      lineEndingIfNeeded: () => Unit,
      options: CompileOptions,
      raw: /* value */ String => Unit,
      resume: () => String,
      setData: (/* key */ lastWasTag | expectFirstItem | slurpOneLineEnding | slurpAllLineEndings | fencedCodeInside | fencesCount | flowCodeSeenData | ignoreEncode | headingRank | inCodeText | characterReferenceType | tightStack | definitions, /* value */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData['lastWasTag' | 'expectFirstItem' | 'slurpOneLineEnding' | 'slurpAllLineEndings' | 'fencedCodeInside' | 'fencesCount' | 'flowCodeSeenData' | 'ignoreEncode' | 'headingRank' | 'inCodeText' | 'characterReferenceType' | 'tightStack' | 'definitions'] */ js.Any
        ]) => Unit,
      tag: /* value */ String => Unit
    ): OmitCompileContextsliceSe = {
      val __obj = js.Dynamic.literal(buffer = js.Any.fromFunction0(buffer), encode = js.Any.fromFunction1(encode), getData = js.Any.fromFunction1(getData), lineEndingIfNeeded = js.Any.fromFunction0(lineEndingIfNeeded), options = options.asInstanceOf[js.Any], raw = js.Any.fromFunction1(raw), resume = js.Any.fromFunction0(resume), setData = js.Any.fromFunction2(setData), tag = js.Any.fromFunction1(tag))
      __obj.asInstanceOf[OmitCompileContextsliceSe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitCompileContextsliceSe] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: () => Unit): Self = StObject.set(x, "buffer", js.Any.fromFunction0(value))
      
      inline def setEncode(value: /* value */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setGetData(
        value: /* key */ lastWasTag | expectFirstItem | slurpOneLineEnding | slurpAllLineEndings | fencedCodeInside | fencesCount | flowCodeSeenData | ignoreEncode | headingRank | inCodeText | characterReferenceType | tightStack | definitions => /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData['lastWasTag' | 'expectFirstItem' | 'slurpOneLineEnding' | 'slurpAllLineEndings' | 'fencedCodeInside' | 'fencesCount' | 'flowCodeSeenData' | 'ignoreEncode' | 'headingRank' | 'inCodeText' | 'characterReferenceType' | 'tightStack' | 'definitions'] */ js.Any
      ): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setLineEndingIfNeeded(value: () => Unit): Self = StObject.set(x, "lineEndingIfNeeded", js.Any.fromFunction0(value))
      
      inline def setOptions(value: CompileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: /* value */ String => Unit): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
      
      inline def setResume(value: () => String): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setSetData(
        value: (/* key */ lastWasTag | expectFirstItem | slurpOneLineEnding | slurpAllLineEndings | fencedCodeInside | fencesCount | flowCodeSeenData | ignoreEncode | headingRank | inCodeText | characterReferenceType | tightStack | definitions, /* value */ js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData['lastWasTag' | 'expectFirstItem' | 'slurpOneLineEnding' | 'slurpAllLineEndings' | 'fencedCodeInside' | 'fencesCount' | 'flowCodeSeenData' | 'ignoreEncode' | 'headingRank' | 'inCodeText' | 'characterReferenceType' | 'tightStack' | 'definitions'] */ js.Any
            ]) => Unit
      ): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
      
      inline def setTag(value: /* value */ String => Unit): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Omit<std.Partial<micromark-util-types.micromark-util-types.Token>, 'type'> */
  trait OmitPartialTokentype extends StObject {
    
    var _balanced: js.UndefOr[Boolean] = js.undefined
    
    var _close: js.UndefOr[Boolean] = js.undefined
    
    var _container: js.UndefOr[Boolean] = js.undefined
    
    var _inactive: js.UndefOr[Boolean] = js.undefined
    
    var _isInFirstContentOfListItem: js.UndefOr[Boolean] = js.undefined
    
    var _loose: js.UndefOr[Boolean] = js.undefined
    
    var _open: js.UndefOr[Boolean] = js.undefined
    
    var _tokenizer: js.UndefOr[TokenizeContext] = js.undefined
    
    var contentType: js.UndefOr[ContentType] = js.undefined
    
    var end: js.UndefOr[Point] = js.undefined
    
    var next: js.UndefOr[Token] = js.undefined
    
    var previous: js.UndefOr[Token] = js.undefined
    
    var start: js.UndefOr[Point] = js.undefined
  }
  object OmitPartialTokentype {
    
    inline def apply(): OmitPartialTokentype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitPartialTokentype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitPartialTokentype] (val x: Self) extends AnyVal {
      
      inline def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setNext(value: Token): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrevious(value: Token): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def set_balanced(value: Boolean): Self = StObject.set(x, "_balanced", value.asInstanceOf[js.Any])
      
      inline def set_balancedUndefined: Self = StObject.set(x, "_balanced", js.undefined)
      
      inline def set_close(value: Boolean): Self = StObject.set(x, "_close", value.asInstanceOf[js.Any])
      
      inline def set_closeUndefined: Self = StObject.set(x, "_close", js.undefined)
      
      inline def set_container(value: Boolean): Self = StObject.set(x, "_container", value.asInstanceOf[js.Any])
      
      inline def set_containerUndefined: Self = StObject.set(x, "_container", js.undefined)
      
      inline def set_inactive(value: Boolean): Self = StObject.set(x, "_inactive", value.asInstanceOf[js.Any])
      
      inline def set_inactiveUndefined: Self = StObject.set(x, "_inactive", js.undefined)
      
      inline def set_isInFirstContentOfListItem(value: Boolean): Self = StObject.set(x, "_isInFirstContentOfListItem", value.asInstanceOf[js.Any])
      
      inline def set_isInFirstContentOfListItemUndefined: Self = StObject.set(x, "_isInFirstContentOfListItem", js.undefined)
      
      inline def set_loose(value: Boolean): Self = StObject.set(x, "_loose", value.asInstanceOf[js.Any])
      
      inline def set_looseUndefined: Self = StObject.set(x, "_loose", js.undefined)
      
      inline def set_open(value: Boolean): Self = StObject.set(x, "_open", value.asInstanceOf[js.Any])
      
      inline def set_openUndefined: Self = StObject.set(x, "_open", js.undefined)
      
      inline def set_tokenizer(value: TokenizeContext): Self = StObject.set(x, "_tokenizer", value.asInstanceOf[js.Any])
      
      inline def set_tokenizerUndefined: Self = StObject.set(x, "_tokenizer", js.undefined)
    }
  }
  
  /* Inlined std.Omit<micromark-util-types.micromark-util-types.Point, '_bufferIndex' | '_index'> */
  trait OmitPointbufferIndexindex extends StObject {
    
    var column: Double
    
    var line: Double
    
    var offset: Double
  }
  object OmitPointbufferIndexindex {
    
    inline def apply(column: Double, line: Double, offset: Double): OmitPointbufferIndexindex = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitPointbufferIndexindex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitPointbufferIndexindex] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<micromark-util-types.micromark-util-types.Construct, 'resolveAll'> */
  trait PickConstructresolveAll extends StObject {
    
    var resolveAll: js.UndefOr[Resolver] = js.undefined
  }
  object PickConstructresolveAll {
    
    inline def apply(): PickConstructresolveAll = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickConstructresolveAll]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickConstructresolveAll] (val x: Self) extends AnyVal {
      
      inline def setResolveAll(value: (/* events */ js.Array[Event], /* context */ TokenizeContext) => js.Array[Event]): Self = StObject.set(x, "resolveAll", js.Any.fromFunction2(value))
      
      inline def setResolveAllUndefined: Self = StObject.set(x, "resolveAll", js.undefined)
    }
  }
  
  /* Inlined std.Pick<micromark-util-types.micromark-util-types.Token, 'end' | 'start'> */
  trait PickTokenendstart extends StObject {
    
    var end: Point
    
    var start: Point
  }
  object PickTokenendstart {
    
    inline def apply(end: Point, start: Point): PickTokenendstart = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickTokenendstart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickTokenendstart] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
