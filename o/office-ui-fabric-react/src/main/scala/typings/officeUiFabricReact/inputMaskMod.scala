package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMaskMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/inputMask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clearNext(maskCharData: js.Array[IMaskValue], selectionStart: Double): js.Array[IMaskValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("clearNext")(maskCharData.asInstanceOf[js.Any], selectionStart.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMaskValue]]
  
  @scala.inline
  def clearPrev(maskCharData: js.Array[IMaskValue], selectionStart: Double): js.Array[IMaskValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("clearPrev")(maskCharData.asInstanceOf[js.Any], selectionStart.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMaskValue]]
  
  @scala.inline
  def clearRange(maskCharData: js.Array[IMaskValue], selectionStart: Double, selectionCount: Double): js.Array[IMaskValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("clearRange")(maskCharData.asInstanceOf[js.Any], selectionStart.asInstanceOf[js.Any], selectionCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMaskValue]]
  
  @scala.inline
  def getLeftFormatIndex(maskCharData: js.Array[IMaskValue], index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLeftFormatIndex")(maskCharData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getMaskDisplay(mask: String, maskCharData: js.Array[IMaskValue]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaskDisplay")(mask.asInstanceOf[js.Any], maskCharData.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getMaskDisplay(mask: String, maskCharData: js.Array[IMaskValue], maskChar: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaskDisplay")(mask.asInstanceOf[js.Any], maskCharData.asInstanceOf[js.Any], maskChar.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getMaskDisplay(mask: Unit, maskCharData: js.Array[IMaskValue]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaskDisplay")(mask.asInstanceOf[js.Any], maskCharData.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getMaskDisplay(mask: Unit, maskCharData: js.Array[IMaskValue], maskChar: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaskDisplay")(mask.asInstanceOf[js.Any], maskCharData.asInstanceOf[js.Any], maskChar.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getRightFormatIndex(maskCharData: js.Array[IMaskValue], index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRightFormatIndex")(maskCharData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def insertString(maskCharData: js.Array[IMaskValue], selectionStart: Double, newString: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("insertString")(maskCharData.asInstanceOf[js.Any], selectionStart.asInstanceOf[js.Any], newString.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def parseMask(): js.Array[IMaskValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMask")().asInstanceOf[js.Array[IMaskValue]]
  @scala.inline
  def parseMask(mask: String): js.Array[IMaskValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMask")(mask.asInstanceOf[js.Any]).asInstanceOf[js.Array[IMaskValue]]
  @scala.inline
  def parseMask(mask: String, formatChars: StringDictionary[RegExp]): js.Array[IMaskValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMask")(mask.asInstanceOf[js.Any], formatChars.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMaskValue]]
  @scala.inline
  def parseMask(mask: Unit, formatChars: StringDictionary[RegExp]): js.Array[IMaskValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMask")(mask.asInstanceOf[js.Any], formatChars.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMaskValue]]
  
  trait IMaskValue extends StObject {
    
    /**
      * This index refers to the index in the displayMask rather than the inputMask.
      * This means that any escaped characters do not count toward this index.
      */
    var displayIndex: Double
    
    var format: RegExp
    
    var value: js.UndefOr[String] = js.undefined
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
