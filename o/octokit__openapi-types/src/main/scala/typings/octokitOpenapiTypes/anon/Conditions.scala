package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conditions extends StObject {
  
  /**
    * @example
    *
    * The MIT License (MIT)
    *
    * Copyright (c) [year] [fullname]
    *
    * Permission is hereby granted, free of charge, to any person obtaining a copy
    * of this software and associated documentation files (the "Software"), to deal
    * in the Software without restriction, including without limitation the rights
    * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    * copies of the Software, and to permit persons to whom the Software is
    * furnished to do so, subject to the following conditions:
    *
    * The above copyright notice and this permission notice shall be included in all
    * copies or substantial portions of the Software.
    *
    * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    * SOFTWARE.
    */
  var body: String
  
  /**
    * @example [
    *   "include-copyright"
    * ]
    */
  var conditions: js.Array[String]
  
  /** @example A permissive license that is short and to the point. It lets people do anything with your code with proper attribution and without warranty. */
  var description: String
  
  /** @example true */
  var featured: Boolean
  
  /**
    * Format: uri
    * @example http://choosealicense.com/licenses/mit/
    */
  var html_url: String
  
  /** @example Create a text file (typically named LICENSE or LICENSE.txt) in the root of your source code and copy the text of the license into the file. Replace [year] with the current year and [fullname] with the name (or names) of the copyright holders. */
  var implementation: String
  
  /** @example mit */
  var key: String
  
  /**
    * @example [
    *   "no-liability"
    * ]
    */
  var limitations: js.Array[String]
  
  /** @example MIT License */
  var name: String
  
  /** @example MDc6TGljZW5zZW1pdA== */
  var node_id: String
  
  /**
    * @example [
    *   "commercial-use",
    *   "modifications",
    *   "distribution",
    *   "sublicense",
    *   "private-use"
    * ]
    */
  var permissions: js.Array[String]
  
  /** @example MIT */
  var spdx_id: String | Null
  
  /**
    * Format: uri
    * @example https://api.github.com/licenses/mit
    */
  var url: String | Null
}
object Conditions {
  
  inline def apply(
    body: String,
    conditions: js.Array[String],
    description: String,
    featured: Boolean,
    html_url: String,
    implementation: String,
    key: String,
    limitations: js.Array[String],
    name: String,
    node_id: String,
    permissions: js.Array[String]
  ): Conditions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], limitations = limitations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], spdx_id = null, url = null)
    __obj.asInstanceOf[Conditions]
  }
  
  extension [Self <: Conditions](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setImplementation(value: String): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLimitations(value: js.Array[String]): Self = StObject.set(x, "limitations", value.asInstanceOf[js.Any])
    
    inline def setLimitationsVarargs(value: String*): Self = StObject.set(x, "limitations", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setSpdx_id(value: String): Self = StObject.set(x, "spdx_id", value.asInstanceOf[js.Any])
    
    inline def setSpdx_idNull: Self = StObject.set(x, "spdx_id", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
  }
}
