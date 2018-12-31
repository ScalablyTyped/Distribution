package typings
package openui5Lib.sapNs.uiNs.testNs.gherkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.gherkin.dataTableUtils")
@js.native
object dataTableUtilsNs extends js.Object {
  /**
    * Takes the inputed 2D list 'aData' and returns an equivalent object. Each row of data is expected
    * tobe a property-value pair. To create nested objects, add extra columns to the data. E.g.<pre> [  
    * ['Name', 'Alice'],   ['Mass', '135 lbs'],   ['Telephone Number', 'Home', '123-456-7890'],  
    * ['Telephone Number', 'Work', '123-456-0987'] ]</pre>For each data row, the right-most element
    * becomes a property value, and everything else is a propertyname. The property names get normalized
    * according to the strategy defined by the parameter 'oNorm'.E.g. using camelCase strategy<pre>  {   
    * name: 'Alice',    mass: '135 lbs',    telephoneNumber: {      home: '123-456-7890',      work:
    * '123-456-0987'    }  }</pre>
    * @param aData the input data to be converted
    * @param oNorm the normalization function to use to normalize property                                
    *             names. Can also be a string with values 'titleCase', 'pascalCase',                      
    *                       'camelCase', 'hyphenated' or 'none'.
    * @returns - an object equivalent to the input data, with property names normalized
    */
  def toObject(aData: js.Array[js.Array[java.lang.String]]): js.Any = js.native
  def toObject(aData: js.Array[js.Array[java.lang.String]], oNorm: java.lang.String): js.Any = js.native
  def toObject(aData: js.Array[js.Array[java.lang.String]], oNorm: js.Any): js.Any = js.native
  /**
    * Takes the inputed 2D list 'aData' and returns an equivalent list of objects. The data is expected
    * tohave a header row, with each subsequent row being an entity, and each column being a property of
    * thatentity. E.g.<pre>  [    ["Their Name",  "Their Age"],    ["Alice",       "16"],    ["Bob",      
    *   "22"]  ]</pre>The data's column headers become the returned objects' property names. The property
    * names get normalizedaccording to the strategy defined by the parameter 'oNorm'. E.g. using
    * hyphenation strategy this is returned:<pre>  [    {their-name: "Alice", their-age: "16"},   
    * {their-name: "Bob", their-age: "22"}  ]</pre>
    * @param aData the input data to be converted, with a header row
    * @param oNorm the normalization function to use to normalize property                                
    *             names. Can also be a String with values 'titleCase', 'pascalCase',                      
    *                       'camelCase', 'hyphenated' or 'none'.
    * @returns - a list of objects equivalent to the input data, with property names normalized
    */
  def toTable(aData: js.Array[js.Array[java.lang.String]]): js.Array[_] = js.native
  def toTable(aData: js.Array[js.Array[java.lang.String]], oNorm: java.lang.String): js.Array[_] = js.native
  def toTable(aData: js.Array[js.Array[java.lang.String]], oNorm: js.Any): js.Array[_] = js.native
  @JSName("normalization")
  @js.native
  object normalizationNs extends js.Object {
    /**
      * e.g. "First Name" -> "firstName"
      * @param sString the string to normalize
      * @returns the input string with all words after the first capitalized and all spaces removed
      */
    def camelCase(sString: java.lang.String): java.lang.String = js.native
    /**
      * e.g. "First Name" -> "first-name"
      * @param sString the string to normalize
      * @returns the input string trimmed, changed to lower case and with space between words               
      *   replaced by a hyphen ('-')
      */
    def hyphenated(sString: java.lang.String): java.lang.String = js.native
    /**
      * e.g. "First Name" -> "First Name"
      * @param sString the string to normalize
      * @returns the original unchanged input string
      */
    def none(sString: java.lang.String): java.lang.String = js.native
    /**
      * e.g. "first name" -> "FirstName"
      * @param sString the string to normalize
      * @returns the input string with all words capitalized and all spaces removed
      */
    def pascalCase(sString: java.lang.String): java.lang.String = js.native
    /**
      * e.g. "first name" -> "First Name"
      * @param sString the string to normalize
      * @returns the input string trimmed and with all words capitalized
      */
    def titleCase(sString: java.lang.String): java.lang.String = js.native
  }
  
}

