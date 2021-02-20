package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMaskMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "clearNext")
  @js.native
  def clearNext(maskCharData: js.Array[IMaskValue], selectionStart: Double): js.Array[IMaskValue] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "clearPrev")
  @js.native
  def clearPrev(maskCharData: js.Array[IMaskValue], selectionStart: Double): js.Array[IMaskValue] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "clearRange")
  @js.native
  def clearRange(maskCharData: js.Array[IMaskValue], selectionStart: Double, selectionCount: Double): js.Array[IMaskValue] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "getLeftFormatIndex")
  @js.native
  def getLeftFormatIndex(maskCharData: js.Array[IMaskValue], index: Double): Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "getMaskDisplay")
  @js.native
  def getMaskDisplay(mask: js.UndefOr[scala.Nothing], maskCharData: js.Array[IMaskValue]): String = js.native
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "getMaskDisplay")
  @js.native
  def getMaskDisplay(mask: js.UndefOr[scala.Nothing], maskCharData: js.Array[IMaskValue], maskChar: String): String = js.native
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "getMaskDisplay")
  @js.native
  def getMaskDisplay(mask: String, maskCharData: js.Array[IMaskValue]): String = js.native
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "getMaskDisplay")
  @js.native
  def getMaskDisplay(mask: String, maskCharData: js.Array[IMaskValue], maskChar: String): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "getRightFormatIndex")
  @js.native
  def getRightFormatIndex(maskCharData: js.Array[IMaskValue], index: Double): Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "insertString")
  @js.native
  def insertString(maskCharData: js.Array[IMaskValue], selectionStart: Double, newString: String): Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "parseMask")
  @js.native
  def parseMask(): js.Array[IMaskValue] = js.native
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "parseMask")
  @js.native
  def parseMask(mask: js.UndefOr[scala.Nothing], formatChars: StringDictionary[RegExp]): js.Array[IMaskValue] = js.native
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "parseMask")
  @js.native
  def parseMask(mask: String): js.Array[IMaskValue] = js.native
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", "parseMask")
  @js.native
  def parseMask(mask: String, formatChars: StringDictionary[RegExp]): js.Array[IMaskValue] = js.native
  
  @js.native
  trait IMaskValue extends StObject {
    
    /**
      * This index refers to the index in the displayMask rather than the inputMask.
      * This means that any escaped characters do not count toward this index.
      */
    var displayIndex: Double = js.native
    
    var format: RegExp = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object IMaskValue {
    
    @scala.inline
    def apply(displayIndex: Double, format: RegExp): IMaskValue = {
      val __obj = js.Dynamic.literal(displayIndex = displayIndex.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMaskValue]
    }
    
    @scala.inline
    implicit class IMaskValueMutableBuilder[Self <: IMaskValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayIndex(value: Double): Self = StObject.set(x, "displayIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: RegExp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
