package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorBooleans.`true`
import typings.monacoEditor.monacoEditorStrings._os
import typings.monacoEditor.monacoEditorStrings._vscode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUnicodeHighlightOptions extends StObject {
  
  /**
    * Defines allowed characters that are not being highlighted.
    */
  var allowedCharacters: js.UndefOr[Record[String, `true`]] = js.undefined
  
  /**
    * Unicode characters that are common in allowed locales are not being highlighted.
    */
  var allowedLocales: js.UndefOr[Record[String | _os | _vscode, `true`]] = js.undefined
  
  /**
    * Controls whether characters are highlighted that can be confused with basic ASCII characters, except those that are common in the current user locale.
    */
  var ambiguousCharacters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether characters in comments should also be subject to unicode highlighting.
    */
  var includeComments: js.UndefOr[Boolean | InUntrustedWorkspace] = js.undefined
  
  /**
    * Controls whether characters in strings should also be subject to unicode highlighting.
    */
  var includeStrings: js.UndefOr[Boolean | InUntrustedWorkspace] = js.undefined
  
  /**
    * Controls whether characters that just reserve space or have no width at all are highlighted.
    */
  var invisibleCharacters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether all non-basic ASCII characters are highlighted. Only characters between U+0020 and U+007E, tab, line-feed and carriage-return are considered basic ASCII.
    */
  var nonBasicASCII: js.UndefOr[Boolean | InUntrustedWorkspace] = js.undefined
}
object IUnicodeHighlightOptions {
  
  inline def apply(): IUnicodeHighlightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUnicodeHighlightOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUnicodeHighlightOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowedCharacters(value: Record[String, `true`]): Self = StObject.set(x, "allowedCharacters", value.asInstanceOf[js.Any])
    
    inline def setAllowedCharactersUndefined: Self = StObject.set(x, "allowedCharacters", js.undefined)
    
    inline def setAllowedLocales(value: Record[String | _os | _vscode, `true`]): Self = StObject.set(x, "allowedLocales", value.asInstanceOf[js.Any])
    
    inline def setAllowedLocalesUndefined: Self = StObject.set(x, "allowedLocales", js.undefined)
    
    inline def setAmbiguousCharacters(value: Boolean): Self = StObject.set(x, "ambiguousCharacters", value.asInstanceOf[js.Any])
    
    inline def setAmbiguousCharactersUndefined: Self = StObject.set(x, "ambiguousCharacters", js.undefined)
    
    inline def setIncludeComments(value: Boolean | InUntrustedWorkspace): Self = StObject.set(x, "includeComments", value.asInstanceOf[js.Any])
    
    inline def setIncludeCommentsUndefined: Self = StObject.set(x, "includeComments", js.undefined)
    
    inline def setIncludeStrings(value: Boolean | InUntrustedWorkspace): Self = StObject.set(x, "includeStrings", value.asInstanceOf[js.Any])
    
    inline def setIncludeStringsUndefined: Self = StObject.set(x, "includeStrings", js.undefined)
    
    inline def setInvisibleCharacters(value: Boolean): Self = StObject.set(x, "invisibleCharacters", value.asInstanceOf[js.Any])
    
    inline def setInvisibleCharactersUndefined: Self = StObject.set(x, "invisibleCharacters", js.undefined)
    
    inline def setNonBasicASCII(value: Boolean | InUntrustedWorkspace): Self = StObject.set(x, "nonBasicASCII", value.asInstanceOf[js.Any])
    
    inline def setNonBasicASCIIUndefined: Self = StObject.set(x, "nonBasicASCII", js.undefined)
  }
}
