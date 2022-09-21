package typings.pixiSettings

import typings.std.GLenum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Blackberry extends StObject {
    
    var blackberry: Boolean
    
    var blackberry10: Boolean
    
    var chrome: Boolean
    
    var device: Boolean
    
    var firefox: Boolean
    
    var opera: Boolean
  }
  object Blackberry {
    
    inline def apply(
      blackberry: Boolean,
      blackberry10: Boolean,
      chrome: Boolean,
      device: Boolean,
      firefox: Boolean,
      opera: Boolean
    ): Blackberry = {
      val __obj = js.Dynamic.literal(blackberry = blackberry.asInstanceOf[js.Any], blackberry10 = blackberry10.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blackberry]
    }
    
    extension [Self <: Blackberry](x: Self) {
      
      inline def setBlackberry(value: Boolean): Self = StObject.set(x, "blackberry", value.asInstanceOf[js.Any])
      
      inline def setBlackberry10(value: Boolean): Self = StObject.set(x, "blackberry10", value.asInstanceOf[js.Any])
      
      inline def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: Boolean): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setFirefox(value: Boolean): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      inline def setOpera(value: Boolean): Self = StObject.set(x, "opera", value.asInstanceOf[js.Any])
    }
  }
  
  trait Device extends StObject {
    
    var device: Boolean
    
    var ipod: Boolean
    
    var phone: Boolean
    
    var tablet: Boolean
    
    var universal: Boolean
  }
  object Device {
    
    inline def apply(device: Boolean, ipod: Boolean, phone: Boolean, tablet: Boolean, universal: Boolean): Device = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], ipod = ipod.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    extension [Self <: Device](x: Self) {
      
      inline def setDevice(value: Boolean): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setIpod(value: Boolean): Self = StObject.set(x, "ipod", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setUniversal(value: Boolean): Self = StObject.set(x, "universal", value.asInstanceOf[js.Any])
    }
  }
  
  trait Phone extends StObject {
    
    var device: Boolean
    
    var phone: Boolean
    
    var tablet: Boolean
  }
  object Phone {
    
    inline def apply(device: Boolean, phone: Boolean, tablet: Boolean): Phone = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Phone]
    }
    
    extension [Self <: Phone](x: Self) {
      
      inline def setDevice(value: Boolean): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofWebGLRenderingConte extends StObject {
    
    /* standard dom */
    val ACTIVE_ATTRIBUTES: GLenum
    
    /* standard dom */
    val ACTIVE_TEXTURE: GLenum
    
    /* standard dom */
    val ACTIVE_UNIFORMS: GLenum
    
    /* standard dom */
    val ALIASED_LINE_WIDTH_RANGE: GLenum
    
    /* standard dom */
    val ALIASED_POINT_SIZE_RANGE: GLenum
    
    /* standard dom */
    val ALPHA: GLenum
    
    /* standard dom */
    val ALPHA_BITS: GLenum
    
    /* standard dom */
    val ALWAYS: GLenum
    
    /* standard dom */
    val ARRAY_BUFFER: GLenum
    
    /* standard dom */
    val ARRAY_BUFFER_BINDING: GLenum
    
    /* standard dom */
    val ATTACHED_SHADERS: GLenum
    
    /* standard dom */
    val BACK: GLenum
    
    /* standard dom */
    val BLEND: GLenum
    
    /* standard dom */
    val BLEND_COLOR: GLenum
    
    /* standard dom */
    val BLEND_DST_ALPHA: GLenum
    
    /* standard dom */
    val BLEND_DST_RGB: GLenum
    
    /* standard dom */
    val BLEND_EQUATION: GLenum
    
    /* standard dom */
    val BLEND_EQUATION_ALPHA: GLenum
    
    /* standard dom */
    val BLEND_EQUATION_RGB: GLenum
    
    /* standard dom */
    val BLEND_SRC_ALPHA: GLenum
    
    /* standard dom */
    val BLEND_SRC_RGB: GLenum
    
    /* standard dom */
    val BLUE_BITS: GLenum
    
    /* standard dom */
    val BOOL: GLenum
    
    /* standard dom */
    val BOOL_VEC2: GLenum
    
    /* standard dom */
    val BOOL_VEC3: GLenum
    
    /* standard dom */
    val BOOL_VEC4: GLenum
    
    /* standard dom */
    val BROWSER_DEFAULT_WEBGL: GLenum
    
    /* standard dom */
    val BUFFER_SIZE: GLenum
    
    /* standard dom */
    val BUFFER_USAGE: GLenum
    
    /* standard dom */
    val BYTE: GLenum
    
    /* standard dom */
    val CCW: GLenum
    
    /* standard dom */
    val CLAMP_TO_EDGE: GLenum
    
    /* standard dom */
    val COLOR_ATTACHMENT0: GLenum
    
    /* standard dom */
    val COLOR_BUFFER_BIT: GLenum
    
    /* standard dom */
    val COLOR_CLEAR_VALUE: GLenum
    
    /* standard dom */
    val COLOR_WRITEMASK: GLenum
    
    /* standard dom */
    val COMPILE_STATUS: GLenum
    
    /* standard dom */
    val COMPRESSED_TEXTURE_FORMATS: GLenum
    
    /* standard dom */
    val CONSTANT_ALPHA: GLenum
    
    /* standard dom */
    val CONSTANT_COLOR: GLenum
    
    /* standard dom */
    val CONTEXT_LOST_WEBGL: GLenum
    
    /* standard dom */
    val CULL_FACE: GLenum
    
    /* standard dom */
    val CULL_FACE_MODE: GLenum
    
    /* standard dom */
    val CURRENT_PROGRAM: GLenum
    
    /* standard dom */
    val CURRENT_VERTEX_ATTRIB: GLenum
    
    /* standard dom */
    val CW: GLenum
    
    /* standard dom */
    val DECR: GLenum
    
    /* standard dom */
    val DECR_WRAP: GLenum
    
    /* standard dom */
    val DELETE_STATUS: GLenum
    
    /* standard dom */
    val DEPTH_ATTACHMENT: GLenum
    
    /* standard dom */
    val DEPTH_BITS: GLenum
    
    /* standard dom */
    val DEPTH_BUFFER_BIT: GLenum
    
    /* standard dom */
    val DEPTH_CLEAR_VALUE: GLenum
    
    /* standard dom */
    val DEPTH_COMPONENT: GLenum
    
    /* standard dom */
    val DEPTH_COMPONENT16: GLenum
    
    /* standard dom */
    val DEPTH_FUNC: GLenum
    
    /* standard dom */
    val DEPTH_RANGE: GLenum
    
    /* standard dom */
    val DEPTH_STENCIL: GLenum
    
    /* standard dom */
    val DEPTH_STENCIL_ATTACHMENT: GLenum
    
    /* standard dom */
    val DEPTH_TEST: GLenum
    
    /* standard dom */
    val DEPTH_WRITEMASK: GLenum
    
    /* standard dom */
    val DITHER: GLenum
    
    /* standard dom */
    val DONT_CARE: GLenum
    
    /* standard dom */
    val DST_ALPHA: GLenum
    
    /* standard dom */
    val DST_COLOR: GLenum
    
    /* standard dom */
    val DYNAMIC_DRAW: GLenum
    
    /* standard dom */
    val ELEMENT_ARRAY_BUFFER: GLenum
    
    /* standard dom */
    val ELEMENT_ARRAY_BUFFER_BINDING: GLenum
    
    /* standard dom */
    val EQUAL: GLenum
    
    /* standard dom */
    val FASTEST: GLenum
    
    /* standard dom */
    val FLOAT: GLenum
    
    /* standard dom */
    val FLOAT_MAT2: GLenum
    
    /* standard dom */
    val FLOAT_MAT3: GLenum
    
    /* standard dom */
    val FLOAT_MAT4: GLenum
    
    /* standard dom */
    val FLOAT_VEC2: GLenum
    
    /* standard dom */
    val FLOAT_VEC3: GLenum
    
    /* standard dom */
    val FLOAT_VEC4: GLenum
    
    /* standard dom */
    val FRAGMENT_SHADER: GLenum
    
    /* standard dom */
    val FRAMEBUFFER: GLenum
    
    /* standard dom */
    val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum
    
    /* standard dom */
    val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum
    
    /* standard dom */
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum
    
    /* standard dom */
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum
    
    /* standard dom */
    val FRAMEBUFFER_BINDING: GLenum
    
    /* standard dom */
    val FRAMEBUFFER_COMPLETE: GLenum
    
    /* standard dom */
    val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum
    
    /* standard dom */
    val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum
    
    /* standard dom */
    val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum
    
    /* standard dom */
    val FRAMEBUFFER_UNSUPPORTED: GLenum
    
    /* standard dom */
    val FRONT: GLenum
    
    /* standard dom */
    val FRONT_AND_BACK: GLenum
    
    /* standard dom */
    val FRONT_FACE: GLenum
    
    /* standard dom */
    val FUNC_ADD: GLenum
    
    /* standard dom */
    val FUNC_REVERSE_SUBTRACT: GLenum
    
    /* standard dom */
    val FUNC_SUBTRACT: GLenum
    
    /* standard dom */
    val GENERATE_MIPMAP_HINT: GLenum
    
    /* standard dom */
    val GEQUAL: GLenum
    
    /* standard dom */
    val GREATER: GLenum
    
    /* standard dom */
    val GREEN_BITS: GLenum
    
    /* standard dom */
    val HIGH_FLOAT: GLenum
    
    /* standard dom */
    val HIGH_INT: GLenum
    
    /* standard dom */
    val IMPLEMENTATION_COLOR_READ_FORMAT: GLenum
    
    /* standard dom */
    val IMPLEMENTATION_COLOR_READ_TYPE: GLenum
    
    /* standard dom */
    val INCR: GLenum
    
    /* standard dom */
    val INCR_WRAP: GLenum
    
    /* standard dom */
    val INT: GLenum
    
    /* standard dom */
    val INT_VEC2: GLenum
    
    /* standard dom */
    val INT_VEC3: GLenum
    
    /* standard dom */
    val INT_VEC4: GLenum
    
    /* standard dom */
    val INVALID_ENUM: GLenum
    
    /* standard dom */
    val INVALID_FRAMEBUFFER_OPERATION: GLenum
    
    /* standard dom */
    val INVALID_OPERATION: GLenum
    
    /* standard dom */
    val INVALID_VALUE: GLenum
    
    /* standard dom */
    val INVERT: GLenum
    
    /* standard dom */
    val KEEP: GLenum
    
    /* standard dom */
    val LEQUAL: GLenum
    
    /* standard dom */
    val LESS: GLenum
    
    /* standard dom */
    val LINEAR: GLenum
    
    /* standard dom */
    val LINEAR_MIPMAP_LINEAR: GLenum
    
    /* standard dom */
    val LINEAR_MIPMAP_NEAREST: GLenum
    
    /* standard dom */
    val LINES: GLenum
    
    /* standard dom */
    val LINE_LOOP: GLenum
    
    /* standard dom */
    val LINE_STRIP: GLenum
    
    /* standard dom */
    val LINE_WIDTH: GLenum
    
    /* standard dom */
    val LINK_STATUS: GLenum
    
    /* standard dom */
    val LOW_FLOAT: GLenum
    
    /* standard dom */
    val LOW_INT: GLenum
    
    /* standard dom */
    val LUMINANCE: GLenum
    
    /* standard dom */
    val LUMINANCE_ALPHA: GLenum
    
    /* standard dom */
    val MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum
    
    /* standard dom */
    val MAX_CUBE_MAP_TEXTURE_SIZE: GLenum
    
    /* standard dom */
    val MAX_FRAGMENT_UNIFORM_VECTORS: GLenum
    
    /* standard dom */
    val MAX_RENDERBUFFER_SIZE: GLenum
    
    /* standard dom */
    val MAX_TEXTURE_IMAGE_UNITS: GLenum
    
    /* standard dom */
    val MAX_TEXTURE_SIZE: GLenum
    
    /* standard dom */
    val MAX_VARYING_VECTORS: GLenum
    
    /* standard dom */
    val MAX_VERTEX_ATTRIBS: GLenum
    
    /* standard dom */
    val MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum
    
    /* standard dom */
    val MAX_VERTEX_UNIFORM_VECTORS: GLenum
    
    /* standard dom */
    val MAX_VIEWPORT_DIMS: GLenum
    
    /* standard dom */
    val MEDIUM_FLOAT: GLenum
    
    /* standard dom */
    val MEDIUM_INT: GLenum
    
    /* standard dom */
    val MIRRORED_REPEAT: GLenum
    
    /* standard dom */
    val NEAREST: GLenum
    
    /* standard dom */
    val NEAREST_MIPMAP_LINEAR: GLenum
    
    /* standard dom */
    val NEAREST_MIPMAP_NEAREST: GLenum
    
    /* standard dom */
    val NEVER: GLenum
    
    /* standard dom */
    val NICEST: GLenum
    
    /* standard dom */
    val NONE: GLenum
    
    /* standard dom */
    val NOTEQUAL: GLenum
    
    /* standard dom */
    val NO_ERROR: GLenum
    
    /* standard dom */
    val ONE: GLenum
    
    /* standard dom */
    val ONE_MINUS_CONSTANT_ALPHA: GLenum
    
    /* standard dom */
    val ONE_MINUS_CONSTANT_COLOR: GLenum
    
    /* standard dom */
    val ONE_MINUS_DST_ALPHA: GLenum
    
    /* standard dom */
    val ONE_MINUS_DST_COLOR: GLenum
    
    /* standard dom */
    val ONE_MINUS_SRC_ALPHA: GLenum
    
    /* standard dom */
    val ONE_MINUS_SRC_COLOR: GLenum
    
    /* standard dom */
    val OUT_OF_MEMORY: GLenum
    
    /* standard dom */
    val PACK_ALIGNMENT: GLenum
    
    /* standard dom */
    val POINTS: GLenum
    
    /* standard dom */
    val POLYGON_OFFSET_FACTOR: GLenum
    
    /* standard dom */
    val POLYGON_OFFSET_FILL: GLenum
    
    /* standard dom */
    val POLYGON_OFFSET_UNITS: GLenum
    
    /* standard dom */
    val RED_BITS: GLenum
    
    /* standard dom */
    val RENDERBUFFER: GLenum
    
    /* standard dom */
    val RENDERBUFFER_ALPHA_SIZE: GLenum
    
    /* standard dom */
    val RENDERBUFFER_BINDING: GLenum
    
    /* standard dom */
    val RENDERBUFFER_BLUE_SIZE: GLenum
    
    /* standard dom */
    val RENDERBUFFER_DEPTH_SIZE: GLenum
    
    /* standard dom */
    val RENDERBUFFER_GREEN_SIZE: GLenum
    
    /* standard dom */
    val RENDERBUFFER_HEIGHT: GLenum
    
    /* standard dom */
    val RENDERBUFFER_INTERNAL_FORMAT: GLenum
    
    /* standard dom */
    val RENDERBUFFER_RED_SIZE: GLenum
    
    /* standard dom */
    val RENDERBUFFER_STENCIL_SIZE: GLenum
    
    /* standard dom */
    val RENDERBUFFER_WIDTH: GLenum
    
    /* standard dom */
    val RENDERER: GLenum
    
    /* standard dom */
    val REPEAT: GLenum
    
    /* standard dom */
    val REPLACE: GLenum
    
    /* standard dom */
    val RGB: GLenum
    
    /* standard dom */
    val RGB565: GLenum
    
    /* standard dom */
    val RGB5_A1: GLenum
    
    /* standard dom */
    val RGBA: GLenum
    
    /* standard dom */
    val RGBA4: GLenum
    
    /* standard dom */
    val SAMPLER_2D: GLenum
    
    /* standard dom */
    val SAMPLER_CUBE: GLenum
    
    /* standard dom */
    val SAMPLES: GLenum
    
    /* standard dom */
    val SAMPLE_ALPHA_TO_COVERAGE: GLenum
    
    /* standard dom */
    val SAMPLE_BUFFERS: GLenum
    
    /* standard dom */
    val SAMPLE_COVERAGE: GLenum
    
    /* standard dom */
    val SAMPLE_COVERAGE_INVERT: GLenum
    
    /* standard dom */
    val SAMPLE_COVERAGE_VALUE: GLenum
    
    /* standard dom */
    val SCISSOR_BOX: GLenum
    
    /* standard dom */
    val SCISSOR_TEST: GLenum
    
    /* standard dom */
    val SHADER_TYPE: GLenum
    
    /* standard dom */
    val SHADING_LANGUAGE_VERSION: GLenum
    
    /* standard dom */
    val SHORT: GLenum
    
    /* standard dom */
    val SRC_ALPHA: GLenum
    
    /* standard dom */
    val SRC_ALPHA_SATURATE: GLenum
    
    /* standard dom */
    val SRC_COLOR: GLenum
    
    /* standard dom */
    val STATIC_DRAW: GLenum
    
    /* standard dom */
    val STENCIL_ATTACHMENT: GLenum
    
    /* standard dom */
    val STENCIL_BACK_FAIL: GLenum
    
    /* standard dom */
    val STENCIL_BACK_FUNC: GLenum
    
    /* standard dom */
    val STENCIL_BACK_PASS_DEPTH_FAIL: GLenum
    
    /* standard dom */
    val STENCIL_BACK_PASS_DEPTH_PASS: GLenum
    
    /* standard dom */
    val STENCIL_BACK_REF: GLenum
    
    /* standard dom */
    val STENCIL_BACK_VALUE_MASK: GLenum
    
    /* standard dom */
    val STENCIL_BACK_WRITEMASK: GLenum
    
    /* standard dom */
    val STENCIL_BITS: GLenum
    
    /* standard dom */
    val STENCIL_BUFFER_BIT: GLenum
    
    /* standard dom */
    val STENCIL_CLEAR_VALUE: GLenum
    
    /* standard dom */
    val STENCIL_FAIL: GLenum
    
    /* standard dom */
    val STENCIL_FUNC: GLenum
    
    /* standard dom */
    val STENCIL_INDEX8: GLenum
    
    /* standard dom */
    val STENCIL_PASS_DEPTH_FAIL: GLenum
    
    /* standard dom */
    val STENCIL_PASS_DEPTH_PASS: GLenum
    
    /* standard dom */
    val STENCIL_REF: GLenum
    
    /* standard dom */
    val STENCIL_TEST: GLenum
    
    /* standard dom */
    val STENCIL_VALUE_MASK: GLenum
    
    /* standard dom */
    val STENCIL_WRITEMASK: GLenum
    
    /* standard dom */
    val STREAM_DRAW: GLenum
    
    /* standard dom */
    val SUBPIXEL_BITS: GLenum
    
    /* standard dom */
    val TEXTURE: GLenum
    
    /* standard dom */
    val TEXTURE0: GLenum
    
    /* standard dom */
    val TEXTURE1: GLenum
    
    /* standard dom */
    val TEXTURE10: GLenum
    
    /* standard dom */
    val TEXTURE11: GLenum
    
    /* standard dom */
    val TEXTURE12: GLenum
    
    /* standard dom */
    val TEXTURE13: GLenum
    
    /* standard dom */
    val TEXTURE14: GLenum
    
    /* standard dom */
    val TEXTURE15: GLenum
    
    /* standard dom */
    val TEXTURE16: GLenum
    
    /* standard dom */
    val TEXTURE17: GLenum
    
    /* standard dom */
    val TEXTURE18: GLenum
    
    /* standard dom */
    val TEXTURE19: GLenum
    
    /* standard dom */
    val TEXTURE2: GLenum
    
    /* standard dom */
    val TEXTURE20: GLenum
    
    /* standard dom */
    val TEXTURE21: GLenum
    
    /* standard dom */
    val TEXTURE22: GLenum
    
    /* standard dom */
    val TEXTURE23: GLenum
    
    /* standard dom */
    val TEXTURE24: GLenum
    
    /* standard dom */
    val TEXTURE25: GLenum
    
    /* standard dom */
    val TEXTURE26: GLenum
    
    /* standard dom */
    val TEXTURE27: GLenum
    
    /* standard dom */
    val TEXTURE28: GLenum
    
    /* standard dom */
    val TEXTURE29: GLenum
    
    /* standard dom */
    val TEXTURE3: GLenum
    
    /* standard dom */
    val TEXTURE30: GLenum
    
    /* standard dom */
    val TEXTURE31: GLenum
    
    /* standard dom */
    val TEXTURE4: GLenum
    
    /* standard dom */
    val TEXTURE5: GLenum
    
    /* standard dom */
    val TEXTURE6: GLenum
    
    /* standard dom */
    val TEXTURE7: GLenum
    
    /* standard dom */
    val TEXTURE8: GLenum
    
    /* standard dom */
    val TEXTURE9: GLenum
    
    /* standard dom */
    val TEXTURE_2D: GLenum
    
    /* standard dom */
    val TEXTURE_BINDING_2D: GLenum
    
    /* standard dom */
    val TEXTURE_BINDING_CUBE_MAP: GLenum
    
    /* standard dom */
    val TEXTURE_CUBE_MAP: GLenum
    
    /* standard dom */
    val TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum
    
    /* standard dom */
    val TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum
    
    /* standard dom */
    val TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum
    
    /* standard dom */
    val TEXTURE_CUBE_MAP_POSITIVE_X: GLenum
    
    /* standard dom */
    val TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum
    
    /* standard dom */
    val TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum
    
    /* standard dom */
    val TEXTURE_MAG_FILTER: GLenum
    
    /* standard dom */
    val TEXTURE_MIN_FILTER: GLenum
    
    /* standard dom */
    val TEXTURE_WRAP_S: GLenum
    
    /* standard dom */
    val TEXTURE_WRAP_T: GLenum
    
    /* standard dom */
    val TRIANGLES: GLenum
    
    /* standard dom */
    val TRIANGLE_FAN: GLenum
    
    /* standard dom */
    val TRIANGLE_STRIP: GLenum
    
    /* standard dom */
    val UNPACK_ALIGNMENT: GLenum
    
    /* standard dom */
    val UNPACK_COLORSPACE_CONVERSION_WEBGL: GLenum
    
    /* standard dom */
    val UNPACK_FLIP_Y_WEBGL: GLenum
    
    /* standard dom */
    val UNPACK_PREMULTIPLY_ALPHA_WEBGL: GLenum
    
    /* standard dom */
    val UNSIGNED_BYTE: GLenum
    
    /* standard dom */
    val UNSIGNED_INT: GLenum
    
    /* standard dom */
    val UNSIGNED_SHORT: GLenum
    
    /* standard dom */
    val UNSIGNED_SHORT_4_4_4_4: GLenum
    
    /* standard dom */
    val UNSIGNED_SHORT_5_5_5_1: GLenum
    
    /* standard dom */
    val UNSIGNED_SHORT_5_6_5: GLenum
    
    /* standard dom */
    val VALIDATE_STATUS: GLenum
    
    /* standard dom */
    val VENDOR: GLenum
    
    /* standard dom */
    val VERSION: GLenum
    
    /* standard dom */
    val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum
    
    /* standard dom */
    val VERTEX_ATTRIB_ARRAY_ENABLED: GLenum
    
    /* standard dom */
    val VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum
    
    /* standard dom */
    val VERTEX_ATTRIB_ARRAY_POINTER: GLenum
    
    /* standard dom */
    val VERTEX_ATTRIB_ARRAY_SIZE: GLenum
    
    /* standard dom */
    val VERTEX_ATTRIB_ARRAY_STRIDE: GLenum
    
    /* standard dom */
    val VERTEX_ATTRIB_ARRAY_TYPE: GLenum
    
    /* standard dom */
    val VERTEX_SHADER: GLenum
    
    /* standard dom */
    val VIEWPORT: GLenum
    
    /* standard dom */
    val ZERO: GLenum
  }
  object TypeofWebGLRenderingConte {
    
    inline def apply(
      ACTIVE_ATTRIBUTES: GLenum,
      ACTIVE_TEXTURE: GLenum,
      ACTIVE_UNIFORMS: GLenum,
      ALIASED_LINE_WIDTH_RANGE: GLenum,
      ALIASED_POINT_SIZE_RANGE: GLenum,
      ALPHA: GLenum,
      ALPHA_BITS: GLenum,
      ALWAYS: GLenum,
      ARRAY_BUFFER: GLenum,
      ARRAY_BUFFER_BINDING: GLenum,
      ATTACHED_SHADERS: GLenum,
      BACK: GLenum,
      BLEND: GLenum,
      BLEND_COLOR: GLenum,
      BLEND_DST_ALPHA: GLenum,
      BLEND_DST_RGB: GLenum,
      BLEND_EQUATION: GLenum,
      BLEND_EQUATION_ALPHA: GLenum,
      BLEND_EQUATION_RGB: GLenum,
      BLEND_SRC_ALPHA: GLenum,
      BLEND_SRC_RGB: GLenum,
      BLUE_BITS: GLenum,
      BOOL: GLenum,
      BOOL_VEC2: GLenum,
      BOOL_VEC3: GLenum,
      BOOL_VEC4: GLenum,
      BROWSER_DEFAULT_WEBGL: GLenum,
      BUFFER_SIZE: GLenum,
      BUFFER_USAGE: GLenum,
      BYTE: GLenum,
      CCW: GLenum,
      CLAMP_TO_EDGE: GLenum,
      COLOR_ATTACHMENT0: GLenum,
      COLOR_BUFFER_BIT: GLenum,
      COLOR_CLEAR_VALUE: GLenum,
      COLOR_WRITEMASK: GLenum,
      COMPILE_STATUS: GLenum,
      COMPRESSED_TEXTURE_FORMATS: GLenum,
      CONSTANT_ALPHA: GLenum,
      CONSTANT_COLOR: GLenum,
      CONTEXT_LOST_WEBGL: GLenum,
      CULL_FACE: GLenum,
      CULL_FACE_MODE: GLenum,
      CURRENT_PROGRAM: GLenum,
      CURRENT_VERTEX_ATTRIB: GLenum,
      CW: GLenum,
      DECR: GLenum,
      DECR_WRAP: GLenum,
      DELETE_STATUS: GLenum,
      DEPTH_ATTACHMENT: GLenum,
      DEPTH_BITS: GLenum,
      DEPTH_BUFFER_BIT: GLenum,
      DEPTH_CLEAR_VALUE: GLenum,
      DEPTH_COMPONENT: GLenum,
      DEPTH_COMPONENT16: GLenum,
      DEPTH_FUNC: GLenum,
      DEPTH_RANGE: GLenum,
      DEPTH_STENCIL: GLenum,
      DEPTH_STENCIL_ATTACHMENT: GLenum,
      DEPTH_TEST: GLenum,
      DEPTH_WRITEMASK: GLenum,
      DITHER: GLenum,
      DONT_CARE: GLenum,
      DST_ALPHA: GLenum,
      DST_COLOR: GLenum,
      DYNAMIC_DRAW: GLenum,
      ELEMENT_ARRAY_BUFFER: GLenum,
      ELEMENT_ARRAY_BUFFER_BINDING: GLenum,
      EQUAL: GLenum,
      FASTEST: GLenum,
      FLOAT: GLenum,
      FLOAT_MAT2: GLenum,
      FLOAT_MAT3: GLenum,
      FLOAT_MAT4: GLenum,
      FLOAT_VEC2: GLenum,
      FLOAT_VEC3: GLenum,
      FLOAT_VEC4: GLenum,
      FRAGMENT_SHADER: GLenum,
      FRAMEBUFFER: GLenum,
      FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum,
      FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum,
      FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum,
      FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum,
      FRAMEBUFFER_BINDING: GLenum,
      FRAMEBUFFER_COMPLETE: GLenum,
      FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum,
      FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum,
      FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum,
      FRAMEBUFFER_UNSUPPORTED: GLenum,
      FRONT: GLenum,
      FRONT_AND_BACK: GLenum,
      FRONT_FACE: GLenum,
      FUNC_ADD: GLenum,
      FUNC_REVERSE_SUBTRACT: GLenum,
      FUNC_SUBTRACT: GLenum,
      GENERATE_MIPMAP_HINT: GLenum,
      GEQUAL: GLenum,
      GREATER: GLenum,
      GREEN_BITS: GLenum,
      HIGH_FLOAT: GLenum,
      HIGH_INT: GLenum,
      IMPLEMENTATION_COLOR_READ_FORMAT: GLenum,
      IMPLEMENTATION_COLOR_READ_TYPE: GLenum,
      INCR: GLenum,
      INCR_WRAP: GLenum,
      INT: GLenum,
      INT_VEC2: GLenum,
      INT_VEC3: GLenum,
      INT_VEC4: GLenum,
      INVALID_ENUM: GLenum,
      INVALID_FRAMEBUFFER_OPERATION: GLenum,
      INVALID_OPERATION: GLenum,
      INVALID_VALUE: GLenum,
      INVERT: GLenum,
      KEEP: GLenum,
      LEQUAL: GLenum,
      LESS: GLenum,
      LINEAR: GLenum,
      LINEAR_MIPMAP_LINEAR: GLenum,
      LINEAR_MIPMAP_NEAREST: GLenum,
      LINES: GLenum,
      LINE_LOOP: GLenum,
      LINE_STRIP: GLenum,
      LINE_WIDTH: GLenum,
      LINK_STATUS: GLenum,
      LOW_FLOAT: GLenum,
      LOW_INT: GLenum,
      LUMINANCE: GLenum,
      LUMINANCE_ALPHA: GLenum,
      MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum,
      MAX_CUBE_MAP_TEXTURE_SIZE: GLenum,
      MAX_FRAGMENT_UNIFORM_VECTORS: GLenum,
      MAX_RENDERBUFFER_SIZE: GLenum,
      MAX_TEXTURE_IMAGE_UNITS: GLenum,
      MAX_TEXTURE_SIZE: GLenum,
      MAX_VARYING_VECTORS: GLenum,
      MAX_VERTEX_ATTRIBS: GLenum,
      MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum,
      MAX_VERTEX_UNIFORM_VECTORS: GLenum,
      MAX_VIEWPORT_DIMS: GLenum,
      MEDIUM_FLOAT: GLenum,
      MEDIUM_INT: GLenum,
      MIRRORED_REPEAT: GLenum,
      NEAREST: GLenum,
      NEAREST_MIPMAP_LINEAR: GLenum,
      NEAREST_MIPMAP_NEAREST: GLenum,
      NEVER: GLenum,
      NICEST: GLenum,
      NONE: GLenum,
      NOTEQUAL: GLenum,
      NO_ERROR: GLenum,
      ONE: GLenum,
      ONE_MINUS_CONSTANT_ALPHA: GLenum,
      ONE_MINUS_CONSTANT_COLOR: GLenum,
      ONE_MINUS_DST_ALPHA: GLenum,
      ONE_MINUS_DST_COLOR: GLenum,
      ONE_MINUS_SRC_ALPHA: GLenum,
      ONE_MINUS_SRC_COLOR: GLenum,
      OUT_OF_MEMORY: GLenum,
      PACK_ALIGNMENT: GLenum,
      POINTS: GLenum,
      POLYGON_OFFSET_FACTOR: GLenum,
      POLYGON_OFFSET_FILL: GLenum,
      POLYGON_OFFSET_UNITS: GLenum,
      RED_BITS: GLenum,
      RENDERBUFFER: GLenum,
      RENDERBUFFER_ALPHA_SIZE: GLenum,
      RENDERBUFFER_BINDING: GLenum,
      RENDERBUFFER_BLUE_SIZE: GLenum,
      RENDERBUFFER_DEPTH_SIZE: GLenum,
      RENDERBUFFER_GREEN_SIZE: GLenum,
      RENDERBUFFER_HEIGHT: GLenum,
      RENDERBUFFER_INTERNAL_FORMAT: GLenum,
      RENDERBUFFER_RED_SIZE: GLenum,
      RENDERBUFFER_STENCIL_SIZE: GLenum,
      RENDERBUFFER_WIDTH: GLenum,
      RENDERER: GLenum,
      REPEAT: GLenum,
      REPLACE: GLenum,
      RGB: GLenum,
      RGB565: GLenum,
      RGB5_A1: GLenum,
      RGBA: GLenum,
      RGBA4: GLenum,
      SAMPLER_2D: GLenum,
      SAMPLER_CUBE: GLenum,
      SAMPLES: GLenum,
      SAMPLE_ALPHA_TO_COVERAGE: GLenum,
      SAMPLE_BUFFERS: GLenum,
      SAMPLE_COVERAGE: GLenum,
      SAMPLE_COVERAGE_INVERT: GLenum,
      SAMPLE_COVERAGE_VALUE: GLenum,
      SCISSOR_BOX: GLenum,
      SCISSOR_TEST: GLenum,
      SHADER_TYPE: GLenum,
      SHADING_LANGUAGE_VERSION: GLenum,
      SHORT: GLenum,
      SRC_ALPHA: GLenum,
      SRC_ALPHA_SATURATE: GLenum,
      SRC_COLOR: GLenum,
      STATIC_DRAW: GLenum,
      STENCIL_ATTACHMENT: GLenum,
      STENCIL_BACK_FAIL: GLenum,
      STENCIL_BACK_FUNC: GLenum,
      STENCIL_BACK_PASS_DEPTH_FAIL: GLenum,
      STENCIL_BACK_PASS_DEPTH_PASS: GLenum,
      STENCIL_BACK_REF: GLenum,
      STENCIL_BACK_VALUE_MASK: GLenum,
      STENCIL_BACK_WRITEMASK: GLenum,
      STENCIL_BITS: GLenum,
      STENCIL_BUFFER_BIT: GLenum,
      STENCIL_CLEAR_VALUE: GLenum,
      STENCIL_FAIL: GLenum,
      STENCIL_FUNC: GLenum,
      STENCIL_INDEX8: GLenum,
      STENCIL_PASS_DEPTH_FAIL: GLenum,
      STENCIL_PASS_DEPTH_PASS: GLenum,
      STENCIL_REF: GLenum,
      STENCIL_TEST: GLenum,
      STENCIL_VALUE_MASK: GLenum,
      STENCIL_WRITEMASK: GLenum,
      STREAM_DRAW: GLenum,
      SUBPIXEL_BITS: GLenum,
      TEXTURE: GLenum,
      TEXTURE0: GLenum,
      TEXTURE1: GLenum,
      TEXTURE10: GLenum,
      TEXTURE11: GLenum,
      TEXTURE12: GLenum,
      TEXTURE13: GLenum,
      TEXTURE14: GLenum,
      TEXTURE15: GLenum,
      TEXTURE16: GLenum,
      TEXTURE17: GLenum,
      TEXTURE18: GLenum,
      TEXTURE19: GLenum,
      TEXTURE2: GLenum,
      TEXTURE20: GLenum,
      TEXTURE21: GLenum,
      TEXTURE22: GLenum,
      TEXTURE23: GLenum,
      TEXTURE24: GLenum,
      TEXTURE25: GLenum,
      TEXTURE26: GLenum,
      TEXTURE27: GLenum,
      TEXTURE28: GLenum,
      TEXTURE29: GLenum,
      TEXTURE3: GLenum,
      TEXTURE30: GLenum,
      TEXTURE31: GLenum,
      TEXTURE4: GLenum,
      TEXTURE5: GLenum,
      TEXTURE6: GLenum,
      TEXTURE7: GLenum
    ): TypeofWebGLRenderingConte = {
      val __obj = js.Dynamic.literal(ACTIVE_ATTRIBUTES = ACTIVE_ATTRIBUTES.asInstanceOf[js.Any], ACTIVE_TEXTURE = ACTIVE_TEXTURE.asInstanceOf[js.Any], ACTIVE_UNIFORMS = ACTIVE_UNIFORMS.asInstanceOf[js.Any], ALIASED_LINE_WIDTH_RANGE = ALIASED_LINE_WIDTH_RANGE.asInstanceOf[js.Any], ALIASED_POINT_SIZE_RANGE = ALIASED_POINT_SIZE_RANGE.asInstanceOf[js.Any], ALPHA = ALPHA.asInstanceOf[js.Any], ALPHA_BITS = ALPHA_BITS.asInstanceOf[js.Any], ALWAYS = ALWAYS.asInstanceOf[js.Any], ARRAY_BUFFER = ARRAY_BUFFER.asInstanceOf[js.Any], ARRAY_BUFFER_BINDING = ARRAY_BUFFER_BINDING.asInstanceOf[js.Any], ATTACHED_SHADERS = ATTACHED_SHADERS.asInstanceOf[js.Any], BACK = BACK.asInstanceOf[js.Any], BLEND = BLEND.asInstanceOf[js.Any], BLEND_COLOR = BLEND_COLOR.asInstanceOf[js.Any], BLEND_DST_ALPHA = BLEND_DST_ALPHA.asInstanceOf[js.Any], BLEND_DST_RGB = BLEND_DST_RGB.asInstanceOf[js.Any], BLEND_EQUATION = BLEND_EQUATION.asInstanceOf[js.Any], BLEND_EQUATION_ALPHA = BLEND_EQUATION_ALPHA.asInstanceOf[js.Any], BLEND_EQUATION_RGB = BLEND_EQUATION_RGB.asInstanceOf[js.Any], BLEND_SRC_ALPHA = BLEND_SRC_ALPHA.asInstanceOf[js.Any], BLEND_SRC_RGB = BLEND_SRC_RGB.asInstanceOf[js.Any], BLUE_BITS = BLUE_BITS.asInstanceOf[js.Any], BOOL = BOOL.asInstanceOf[js.Any], BOOL_VEC2 = BOOL_VEC2.asInstanceOf[js.Any], BOOL_VEC3 = BOOL_VEC3.asInstanceOf[js.Any], BOOL_VEC4 = BOOL_VEC4.asInstanceOf[js.Any], BROWSER_DEFAULT_WEBGL = BROWSER_DEFAULT_WEBGL.asInstanceOf[js.Any], BUFFER_SIZE = BUFFER_SIZE.asInstanceOf[js.Any], BUFFER_USAGE = BUFFER_USAGE.asInstanceOf[js.Any], BYTE = BYTE.asInstanceOf[js.Any], CCW = CCW.asInstanceOf[js.Any], CLAMP_TO_EDGE = CLAMP_TO_EDGE.asInstanceOf[js.Any], COLOR_ATTACHMENT0 = COLOR_ATTACHMENT0.asInstanceOf[js.Any], COLOR_BUFFER_BIT = COLOR_BUFFER_BIT.asInstanceOf[js.Any], COLOR_CLEAR_VALUE = COLOR_CLEAR_VALUE.asInstanceOf[js.Any], COLOR_WRITEMASK = COLOR_WRITEMASK.asInstanceOf[js.Any], COMPILE_STATUS = COMPILE_STATUS.asInstanceOf[js.Any], COMPRESSED_TEXTURE_FORMATS = COMPRESSED_TEXTURE_FORMATS.asInstanceOf[js.Any], CONSTANT_ALPHA = CONSTANT_ALPHA.asInstanceOf[js.Any], CONSTANT_COLOR = CONSTANT_COLOR.asInstanceOf[js.Any], CONTEXT_LOST_WEBGL = CONTEXT_LOST_WEBGL.asInstanceOf[js.Any], CULL_FACE = CULL_FACE.asInstanceOf[js.Any], CULL_FACE_MODE = CULL_FACE_MODE.asInstanceOf[js.Any], CURRENT_PROGRAM = CURRENT_PROGRAM.asInstanceOf[js.Any], CURRENT_VERTEX_ATTRIB = CURRENT_VERTEX_ATTRIB.asInstanceOf[js.Any], CW = CW.asInstanceOf[js.Any], DECR = DECR.asInstanceOf[js.Any], DECR_WRAP = DECR_WRAP.asInstanceOf[js.Any], DELETE_STATUS = DELETE_STATUS.asInstanceOf[js.Any], DEPTH_ATTACHMENT = DEPTH_ATTACHMENT.asInstanceOf[js.Any], DEPTH_BITS = DEPTH_BITS.asInstanceOf[js.Any], DEPTH_BUFFER_BIT = DEPTH_BUFFER_BIT.asInstanceOf[js.Any], DEPTH_CLEAR_VALUE = DEPTH_CLEAR_VALUE.asInstanceOf[js.Any], DEPTH_COMPONENT = DEPTH_COMPONENT.asInstanceOf[js.Any], DEPTH_COMPONENT16 = DEPTH_COMPONENT16.asInstanceOf[js.Any], DEPTH_FUNC = DEPTH_FUNC.asInstanceOf[js.Any], DEPTH_RANGE = DEPTH_RANGE.asInstanceOf[js.Any], DEPTH_STENCIL = DEPTH_STENCIL.asInstanceOf[js.Any], DEPTH_STENCIL_ATTACHMENT = DEPTH_STENCIL_ATTACHMENT.asInstanceOf[js.Any], DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], DEPTH_WRITEMASK = DEPTH_WRITEMASK.asInstanceOf[js.Any], DITHER = DITHER.asInstanceOf[js.Any], DONT_CARE = DONT_CARE.asInstanceOf[js.Any], DST_ALPHA = DST_ALPHA.asInstanceOf[js.Any], DST_COLOR = DST_COLOR.asInstanceOf[js.Any], DYNAMIC_DRAW = DYNAMIC_DRAW.asInstanceOf[js.Any], ELEMENT_ARRAY_BUFFER = ELEMENT_ARRAY_BUFFER.asInstanceOf[js.Any], ELEMENT_ARRAY_BUFFER_BINDING = ELEMENT_ARRAY_BUFFER_BINDING.asInstanceOf[js.Any], EQUAL = EQUAL.asInstanceOf[js.Any], FASTEST = FASTEST.asInstanceOf[js.Any], FLOAT = FLOAT.asInstanceOf[js.Any], FLOAT_MAT2 = FLOAT_MAT2.asInstanceOf[js.Any], FLOAT_MAT3 = FLOAT_MAT3.asInstanceOf[js.Any], FLOAT_MAT4 = FLOAT_MAT4.asInstanceOf[js.Any], FLOAT_VEC2 = FLOAT_VEC2.asInstanceOf[js.Any], FLOAT_VEC3 = FLOAT_VEC3.asInstanceOf[js.Any], FLOAT_VEC4 = FLOAT_VEC4.asInstanceOf[js.Any], FRAGMENT_SHADER = FRAGMENT_SHADER.asInstanceOf[js.Any], FRAMEBUFFER = FRAMEBUFFER.asInstanceOf[js.Any], FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = FRAMEBUFFER_ATTACHMENT_OBJECT_NAME.asInstanceOf[js.Any], FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE.asInstanceOf[js.Any], FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE.asInstanceOf[js.Any], FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL.asInstanceOf[js.Any], FRAMEBUFFER_BINDING = FRAMEBUFFER_BINDING.asInstanceOf[js.Any], FRAMEBUFFER_COMPLETE = FRAMEBUFFER_COMPLETE.asInstanceOf[js.Any], FRAMEBUFFER_INCOMPLETE_ATTACHMENT = FRAMEBUFFER_INCOMPLETE_ATTACHMENT.asInstanceOf[js.Any], FRAMEBUFFER_INCOMPLETE_DIMENSIONS = FRAMEBUFFER_INCOMPLETE_DIMENSIONS.asInstanceOf[js.Any], FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT.asInstanceOf[js.Any], FRAMEBUFFER_UNSUPPORTED = FRAMEBUFFER_UNSUPPORTED.asInstanceOf[js.Any], FRONT = FRONT.asInstanceOf[js.Any], FRONT_AND_BACK = FRONT_AND_BACK.asInstanceOf[js.Any], FRONT_FACE = FRONT_FACE.asInstanceOf[js.Any], FUNC_ADD = FUNC_ADD.asInstanceOf[js.Any], FUNC_REVERSE_SUBTRACT = FUNC_REVERSE_SUBTRACT.asInstanceOf[js.Any], FUNC_SUBTRACT = FUNC_SUBTRACT.asInstanceOf[js.Any], GENERATE_MIPMAP_HINT = GENERATE_MIPMAP_HINT.asInstanceOf[js.Any], GEQUAL = GEQUAL.asInstanceOf[js.Any], GREATER = GREATER.asInstanceOf[js.Any], GREEN_BITS = GREEN_BITS.asInstanceOf[js.Any], HIGH_FLOAT = HIGH_FLOAT.asInstanceOf[js.Any], HIGH_INT = HIGH_INT.asInstanceOf[js.Any], IMPLEMENTATION_COLOR_READ_FORMAT = IMPLEMENTATION_COLOR_READ_FORMAT.asInstanceOf[js.Any], IMPLEMENTATION_COLOR_READ_TYPE = IMPLEMENTATION_COLOR_READ_TYPE.asInstanceOf[js.Any], INCR = INCR.asInstanceOf[js.Any], INCR_WRAP = INCR_WRAP.asInstanceOf[js.Any], INT = INT.asInstanceOf[js.Any], INT_VEC2 = INT_VEC2.asInstanceOf[js.Any], INT_VEC3 = INT_VEC3.asInstanceOf[js.Any], INT_VEC4 = INT_VEC4.asInstanceOf[js.Any], INVALID_ENUM = INVALID_ENUM.asInstanceOf[js.Any], INVALID_FRAMEBUFFER_OPERATION = INVALID_FRAMEBUFFER_OPERATION.asInstanceOf[js.Any], INVALID_OPERATION = INVALID_OPERATION.asInstanceOf[js.Any], INVALID_VALUE = INVALID_VALUE.asInstanceOf[js.Any], INVERT = INVERT.asInstanceOf[js.Any], KEEP = KEEP.asInstanceOf[js.Any], LEQUAL = LEQUAL.asInstanceOf[js.Any], LESS = LESS.asInstanceOf[js.Any], LINEAR = LINEAR.asInstanceOf[js.Any], LINEAR_MIPMAP_LINEAR = LINEAR_MIPMAP_LINEAR.asInstanceOf[js.Any], LINEAR_MIPMAP_NEAREST = LINEAR_MIPMAP_NEAREST.asInstanceOf[js.Any], LINES = LINES.asInstanceOf[js.Any], LINE_LOOP = LINE_LOOP.asInstanceOf[js.Any], LINE_STRIP = LINE_STRIP.asInstanceOf[js.Any], LINE_WIDTH = LINE_WIDTH.asInstanceOf[js.Any], LINK_STATUS = LINK_STATUS.asInstanceOf[js.Any], LOW_FLOAT = LOW_FLOAT.asInstanceOf[js.Any], LOW_INT = LOW_INT.asInstanceOf[js.Any], LUMINANCE = LUMINANCE.asInstanceOf[js.Any], LUMINANCE_ALPHA = LUMINANCE_ALPHA.asInstanceOf[js.Any], MAX_COMBINED_TEXTURE_IMAGE_UNITS = MAX_COMBINED_TEXTURE_IMAGE_UNITS.asInstanceOf[js.Any], MAX_CUBE_MAP_TEXTURE_SIZE = MAX_CUBE_MAP_TEXTURE_SIZE.asInstanceOf[js.Any], MAX_FRAGMENT_UNIFORM_VECTORS = MAX_FRAGMENT_UNIFORM_VECTORS.asInstanceOf[js.Any], MAX_RENDERBUFFER_SIZE = MAX_RENDERBUFFER_SIZE.asInstanceOf[js.Any], MAX_TEXTURE_IMAGE_UNITS = MAX_TEXTURE_IMAGE_UNITS.asInstanceOf[js.Any], MAX_TEXTURE_SIZE = MAX_TEXTURE_SIZE.asInstanceOf[js.Any], MAX_VARYING_VECTORS = MAX_VARYING_VECTORS.asInstanceOf[js.Any], MAX_VERTEX_ATTRIBS = MAX_VERTEX_ATTRIBS.asInstanceOf[js.Any], MAX_VERTEX_TEXTURE_IMAGE_UNITS = MAX_VERTEX_TEXTURE_IMAGE_UNITS.asInstanceOf[js.Any], MAX_VERTEX_UNIFORM_VECTORS = MAX_VERTEX_UNIFORM_VECTORS.asInstanceOf[js.Any], MAX_VIEWPORT_DIMS = MAX_VIEWPORT_DIMS.asInstanceOf[js.Any], MEDIUM_FLOAT = MEDIUM_FLOAT.asInstanceOf[js.Any], MEDIUM_INT = MEDIUM_INT.asInstanceOf[js.Any], MIRRORED_REPEAT = MIRRORED_REPEAT.asInstanceOf[js.Any], NEAREST = NEAREST.asInstanceOf[js.Any], NEAREST_MIPMAP_LINEAR = NEAREST_MIPMAP_LINEAR.asInstanceOf[js.Any], NEAREST_MIPMAP_NEAREST = NEAREST_MIPMAP_NEAREST.asInstanceOf[js.Any], NEVER = NEVER.asInstanceOf[js.Any], NICEST = NICEST.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], NOTEQUAL = NOTEQUAL.asInstanceOf[js.Any], NO_ERROR = NO_ERROR.asInstanceOf[js.Any], ONE = ONE.asInstanceOf[js.Any], ONE_MINUS_CONSTANT_ALPHA = ONE_MINUS_CONSTANT_ALPHA.asInstanceOf[js.Any], ONE_MINUS_CONSTANT_COLOR = ONE_MINUS_CONSTANT_COLOR.asInstanceOf[js.Any], ONE_MINUS_DST_ALPHA = ONE_MINUS_DST_ALPHA.asInstanceOf[js.Any], ONE_MINUS_DST_COLOR = ONE_MINUS_DST_COLOR.asInstanceOf[js.Any], ONE_MINUS_SRC_ALPHA = ONE_MINUS_SRC_ALPHA.asInstanceOf[js.Any], ONE_MINUS_SRC_COLOR = ONE_MINUS_SRC_COLOR.asInstanceOf[js.Any], OUT_OF_MEMORY = OUT_OF_MEMORY.asInstanceOf[js.Any], PACK_ALIGNMENT = PACK_ALIGNMENT.asInstanceOf[js.Any], POINTS = POINTS.asInstanceOf[js.Any], POLYGON_OFFSET_FACTOR = POLYGON_OFFSET_FACTOR.asInstanceOf[js.Any], POLYGON_OFFSET_FILL = POLYGON_OFFSET_FILL.asInstanceOf[js.Any], POLYGON_OFFSET_UNITS = POLYGON_OFFSET_UNITS.asInstanceOf[js.Any], RED_BITS = RED_BITS.asInstanceOf[js.Any], RENDERBUFFER = RENDERBUFFER.asInstanceOf[js.Any], RENDERBUFFER_ALPHA_SIZE = RENDERBUFFER_ALPHA_SIZE.asInstanceOf[js.Any], RENDERBUFFER_BINDING = RENDERBUFFER_BINDING.asInstanceOf[js.Any], RENDERBUFFER_BLUE_SIZE = RENDERBUFFER_BLUE_SIZE.asInstanceOf[js.Any], RENDERBUFFER_DEPTH_SIZE = RENDERBUFFER_DEPTH_SIZE.asInstanceOf[js.Any], RENDERBUFFER_GREEN_SIZE = RENDERBUFFER_GREEN_SIZE.asInstanceOf[js.Any], RENDERBUFFER_HEIGHT = RENDERBUFFER_HEIGHT.asInstanceOf[js.Any], RENDERBUFFER_INTERNAL_FORMAT = RENDERBUFFER_INTERNAL_FORMAT.asInstanceOf[js.Any], RENDERBUFFER_RED_SIZE = RENDERBUFFER_RED_SIZE.asInstanceOf[js.Any], RENDERBUFFER_STENCIL_SIZE = RENDERBUFFER_STENCIL_SIZE.asInstanceOf[js.Any], RENDERBUFFER_WIDTH = RENDERBUFFER_WIDTH.asInstanceOf[js.Any], RENDERER = RENDERER.asInstanceOf[js.Any], REPEAT = REPEAT.asInstanceOf[js.Any], REPLACE = REPLACE.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], RGB565 = RGB565.asInstanceOf[js.Any], RGB5_A1 = RGB5_A1.asInstanceOf[js.Any], RGBA = RGBA.asInstanceOf[js.Any], RGBA4 = RGBA4.asInstanceOf[js.Any], SAMPLER_2D = SAMPLER_2D.asInstanceOf[js.Any], SAMPLER_CUBE = SAMPLER_CUBE.asInstanceOf[js.Any], SAMPLES = SAMPLES.asInstanceOf[js.Any], SAMPLE_ALPHA_TO_COVERAGE = SAMPLE_ALPHA_TO_COVERAGE.asInstanceOf[js.Any], SAMPLE_BUFFERS = SAMPLE_BUFFERS.asInstanceOf[js.Any], SAMPLE_COVERAGE = SAMPLE_COVERAGE.asInstanceOf[js.Any], SAMPLE_COVERAGE_INVERT = SAMPLE_COVERAGE_INVERT.asInstanceOf[js.Any], SAMPLE_COVERAGE_VALUE = SAMPLE_COVERAGE_VALUE.asInstanceOf[js.Any], SCISSOR_BOX = SCISSOR_BOX.asInstanceOf[js.Any], SCISSOR_TEST = SCISSOR_TEST.asInstanceOf[js.Any], SHADER_TYPE = SHADER_TYPE.asInstanceOf[js.Any], SHADING_LANGUAGE_VERSION = SHADING_LANGUAGE_VERSION.asInstanceOf[js.Any], SHORT = SHORT.asInstanceOf[js.Any], SRC_ALPHA = SRC_ALPHA.asInstanceOf[js.Any], SRC_ALPHA_SATURATE = SRC_ALPHA_SATURATE.asInstanceOf[js.Any], SRC_COLOR = SRC_COLOR.asInstanceOf[js.Any], STATIC_DRAW = STATIC_DRAW.asInstanceOf[js.Any], STENCIL_ATTACHMENT = STENCIL_ATTACHMENT.asInstanceOf[js.Any], STENCIL_BACK_FAIL = STENCIL_BACK_FAIL.asInstanceOf[js.Any], STENCIL_BACK_FUNC = STENCIL_BACK_FUNC.asInstanceOf[js.Any], STENCIL_BACK_PASS_DEPTH_FAIL = STENCIL_BACK_PASS_DEPTH_FAIL.asInstanceOf[js.Any], STENCIL_BACK_PASS_DEPTH_PASS = STENCIL_BACK_PASS_DEPTH_PASS.asInstanceOf[js.Any], STENCIL_BACK_REF = STENCIL_BACK_REF.asInstanceOf[js.Any], STENCIL_BACK_VALUE_MASK = STENCIL_BACK_VALUE_MASK.asInstanceOf[js.Any], STENCIL_BACK_WRITEMASK = STENCIL_BACK_WRITEMASK.asInstanceOf[js.Any], STENCIL_BITS = STENCIL_BITS.asInstanceOf[js.Any], STENCIL_BUFFER_BIT = STENCIL_BUFFER_BIT.asInstanceOf[js.Any], STENCIL_CLEAR_VALUE = STENCIL_CLEAR_VALUE.asInstanceOf[js.Any], STENCIL_FAIL = STENCIL_FAIL.asInstanceOf[js.Any], STENCIL_FUNC = STENCIL_FUNC.asInstanceOf[js.Any], STENCIL_INDEX8 = STENCIL_INDEX8.asInstanceOf[js.Any], STENCIL_PASS_DEPTH_FAIL = STENCIL_PASS_DEPTH_FAIL.asInstanceOf[js.Any], STENCIL_PASS_DEPTH_PASS = STENCIL_PASS_DEPTH_PASS.asInstanceOf[js.Any], STENCIL_REF = STENCIL_REF.asInstanceOf[js.Any], STENCIL_TEST = STENCIL_TEST.asInstanceOf[js.Any], STENCIL_VALUE_MASK = STENCIL_VALUE_MASK.asInstanceOf[js.Any], STENCIL_WRITEMASK = STENCIL_WRITEMASK.asInstanceOf[js.Any], STREAM_DRAW = STREAM_DRAW.asInstanceOf[js.Any], SUBPIXEL_BITS = SUBPIXEL_BITS.asInstanceOf[js.Any], TEXTURE = TEXTURE.asInstanceOf[js.Any], TEXTURE0 = TEXTURE0.asInstanceOf[js.Any], TEXTURE1 = TEXTURE1.asInstanceOf[js.Any], TEXTURE10 = TEXTURE10.asInstanceOf[js.Any], TEXTURE11 = TEXTURE11.asInstanceOf[js.Any], TEXTURE12 = TEXTURE12.asInstanceOf[js.Any], TEXTURE13 = TEXTURE13.asInstanceOf[js.Any], TEXTURE14 = TEXTURE14.asInstanceOf[js.Any], TEXTURE15 = TEXTURE15.asInstanceOf[js.Any], TEXTURE16 = TEXTURE16.asInstanceOf[js.Any], TEXTURE17 = TEXTURE17.asInstanceOf[js.Any], TEXTURE18 = TEXTURE18.asInstanceOf[js.Any], TEXTURE19 = TEXTURE19.asInstanceOf[js.Any], TEXTURE2 = TEXTURE2.asInstanceOf[js.Any], TEXTURE20 = TEXTURE20.asInstanceOf[js.Any], TEXTURE21 = TEXTURE21.asInstanceOf[js.Any], TEXTURE22 = TEXTURE22.asInstanceOf[js.Any], TEXTURE23 = TEXTURE23.asInstanceOf[js.Any], TEXTURE24 = TEXTURE24.asInstanceOf[js.Any], TEXTURE25 = TEXTURE25.asInstanceOf[js.Any], TEXTURE26 = TEXTURE26.asInstanceOf[js.Any], TEXTURE27 = TEXTURE27.asInstanceOf[js.Any], TEXTURE28 = TEXTURE28.asInstanceOf[js.Any], TEXTURE29 = TEXTURE29.asInstanceOf[js.Any], TEXTURE3 = TEXTURE3.asInstanceOf[js.Any], TEXTURE30 = TEXTURE30.asInstanceOf[js.Any], TEXTURE31 = TEXTURE31.asInstanceOf[js.Any], TEXTURE4 = TEXTURE4.asInstanceOf[js.Any], TEXTURE5 = TEXTURE5.asInstanceOf[js.Any], TEXTURE6 = TEXTURE6.asInstanceOf[js.Any], TEXTURE7 = TEXTURE7.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofWebGLRenderingConte]
    }
    
    extension [Self <: TypeofWebGLRenderingConte](x: Self) {
      
      inline def setACTIVE_ATTRIBUTES(value: GLenum): Self = StObject.set(x, "ACTIVE_ATTRIBUTES", value.asInstanceOf[js.Any])
      
      inline def setACTIVE_TEXTURE(value: GLenum): Self = StObject.set(x, "ACTIVE_TEXTURE", value.asInstanceOf[js.Any])
      
      inline def setACTIVE_UNIFORMS(value: GLenum): Self = StObject.set(x, "ACTIVE_UNIFORMS", value.asInstanceOf[js.Any])
      
      inline def setALIASED_LINE_WIDTH_RANGE(value: GLenum): Self = StObject.set(x, "ALIASED_LINE_WIDTH_RANGE", value.asInstanceOf[js.Any])
      
      inline def setALIASED_POINT_SIZE_RANGE(value: GLenum): Self = StObject.set(x, "ALIASED_POINT_SIZE_RANGE", value.asInstanceOf[js.Any])
      
      inline def setALPHA(value: GLenum): Self = StObject.set(x, "ALPHA", value.asInstanceOf[js.Any])
      
      inline def setALPHA_BITS(value: GLenum): Self = StObject.set(x, "ALPHA_BITS", value.asInstanceOf[js.Any])
      
      inline def setALWAYS(value: GLenum): Self = StObject.set(x, "ALWAYS", value.asInstanceOf[js.Any])
      
      inline def setARRAY_BUFFER(value: GLenum): Self = StObject.set(x, "ARRAY_BUFFER", value.asInstanceOf[js.Any])
      
      inline def setARRAY_BUFFER_BINDING(value: GLenum): Self = StObject.set(x, "ARRAY_BUFFER_BINDING", value.asInstanceOf[js.Any])
      
      inline def setATTACHED_SHADERS(value: GLenum): Self = StObject.set(x, "ATTACHED_SHADERS", value.asInstanceOf[js.Any])
      
      inline def setBACK(value: GLenum): Self = StObject.set(x, "BACK", value.asInstanceOf[js.Any])
      
      inline def setBLEND(value: GLenum): Self = StObject.set(x, "BLEND", value.asInstanceOf[js.Any])
      
      inline def setBLEND_COLOR(value: GLenum): Self = StObject.set(x, "BLEND_COLOR", value.asInstanceOf[js.Any])
      
      inline def setBLEND_DST_ALPHA(value: GLenum): Self = StObject.set(x, "BLEND_DST_ALPHA", value.asInstanceOf[js.Any])
      
      inline def setBLEND_DST_RGB(value: GLenum): Self = StObject.set(x, "BLEND_DST_RGB", value.asInstanceOf[js.Any])
      
      inline def setBLEND_EQUATION(value: GLenum): Self = StObject.set(x, "BLEND_EQUATION", value.asInstanceOf[js.Any])
      
      inline def setBLEND_EQUATION_ALPHA(value: GLenum): Self = StObject.set(x, "BLEND_EQUATION_ALPHA", value.asInstanceOf[js.Any])
      
      inline def setBLEND_EQUATION_RGB(value: GLenum): Self = StObject.set(x, "BLEND_EQUATION_RGB", value.asInstanceOf[js.Any])
      
      inline def setBLEND_SRC_ALPHA(value: GLenum): Self = StObject.set(x, "BLEND_SRC_ALPHA", value.asInstanceOf[js.Any])
      
      inline def setBLEND_SRC_RGB(value: GLenum): Self = StObject.set(x, "BLEND_SRC_RGB", value.asInstanceOf[js.Any])
      
      inline def setBLUE_BITS(value: GLenum): Self = StObject.set(x, "BLUE_BITS", value.asInstanceOf[js.Any])
      
      inline def setBOOL(value: GLenum): Self = StObject.set(x, "BOOL", value.asInstanceOf[js.Any])
      
      inline def setBOOL_VEC2(value: GLenum): Self = StObject.set(x, "BOOL_VEC2", value.asInstanceOf[js.Any])
      
      inline def setBOOL_VEC3(value: GLenum): Self = StObject.set(x, "BOOL_VEC3", value.asInstanceOf[js.Any])
      
      inline def setBOOL_VEC4(value: GLenum): Self = StObject.set(x, "BOOL_VEC4", value.asInstanceOf[js.Any])
      
      inline def setBROWSER_DEFAULT_WEBGL(value: GLenum): Self = StObject.set(x, "BROWSER_DEFAULT_WEBGL", value.asInstanceOf[js.Any])
      
      inline def setBUFFER_SIZE(value: GLenum): Self = StObject.set(x, "BUFFER_SIZE", value.asInstanceOf[js.Any])
      
      inline def setBUFFER_USAGE(value: GLenum): Self = StObject.set(x, "BUFFER_USAGE", value.asInstanceOf[js.Any])
      
      inline def setBYTE(value: GLenum): Self = StObject.set(x, "BYTE", value.asInstanceOf[js.Any])
      
      inline def setCCW(value: GLenum): Self = StObject.set(x, "CCW", value.asInstanceOf[js.Any])
      
      inline def setCLAMP_TO_EDGE(value: GLenum): Self = StObject.set(x, "CLAMP_TO_EDGE", value.asInstanceOf[js.Any])
      
      inline def setCOLOR_ATTACHMENT0(value: GLenum): Self = StObject.set(x, "COLOR_ATTACHMENT0", value.asInstanceOf[js.Any])
      
      inline def setCOLOR_BUFFER_BIT(value: GLenum): Self = StObject.set(x, "COLOR_BUFFER_BIT", value.asInstanceOf[js.Any])
      
      inline def setCOLOR_CLEAR_VALUE(value: GLenum): Self = StObject.set(x, "COLOR_CLEAR_VALUE", value.asInstanceOf[js.Any])
      
      inline def setCOLOR_WRITEMASK(value: GLenum): Self = StObject.set(x, "COLOR_WRITEMASK", value.asInstanceOf[js.Any])
      
      inline def setCOMPILE_STATUS(value: GLenum): Self = StObject.set(x, "COMPILE_STATUS", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_TEXTURE_FORMATS(value: GLenum): Self = StObject.set(x, "COMPRESSED_TEXTURE_FORMATS", value.asInstanceOf[js.Any])
      
      inline def setCONSTANT_ALPHA(value: GLenum): Self = StObject.set(x, "CONSTANT_ALPHA", value.asInstanceOf[js.Any])
      
      inline def setCONSTANT_COLOR(value: GLenum): Self = StObject.set(x, "CONSTANT_COLOR", value.asInstanceOf[js.Any])
      
      inline def setCONTEXT_LOST_WEBGL(value: GLenum): Self = StObject.set(x, "CONTEXT_LOST_WEBGL", value.asInstanceOf[js.Any])
      
      inline def setCULL_FACE(value: GLenum): Self = StObject.set(x, "CULL_FACE", value.asInstanceOf[js.Any])
      
      inline def setCULL_FACE_MODE(value: GLenum): Self = StObject.set(x, "CULL_FACE_MODE", value.asInstanceOf[js.Any])
      
      inline def setCURRENT_PROGRAM(value: GLenum): Self = StObject.set(x, "CURRENT_PROGRAM", value.asInstanceOf[js.Any])
      
      inline def setCURRENT_VERTEX_ATTRIB(value: GLenum): Self = StObject.set(x, "CURRENT_VERTEX_ATTRIB", value.asInstanceOf[js.Any])
      
      inline def setCW(value: GLenum): Self = StObject.set(x, "CW", value.asInstanceOf[js.Any])
      
      inline def setDECR(value: GLenum): Self = StObject.set(x, "DECR", value.asInstanceOf[js.Any])
      
      inline def setDECR_WRAP(value: GLenum): Self = StObject.set(x, "DECR_WRAP", value.asInstanceOf[js.Any])
      
      inline def setDELETE_STATUS(value: GLenum): Self = StObject.set(x, "DELETE_STATUS", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_ATTACHMENT(value: GLenum): Self = StObject.set(x, "DEPTH_ATTACHMENT", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_BITS(value: GLenum): Self = StObject.set(x, "DEPTH_BITS", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_BUFFER_BIT(value: GLenum): Self = StObject.set(x, "DEPTH_BUFFER_BIT", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_CLEAR_VALUE(value: GLenum): Self = StObject.set(x, "DEPTH_CLEAR_VALUE", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_COMPONENT(value: GLenum): Self = StObject.set(x, "DEPTH_COMPONENT", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_COMPONENT16(value: GLenum): Self = StObject.set(x, "DEPTH_COMPONENT16", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_FUNC(value: GLenum): Self = StObject.set(x, "DEPTH_FUNC", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_RANGE(value: GLenum): Self = StObject.set(x, "DEPTH_RANGE", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_STENCIL(value: GLenum): Self = StObject.set(x, "DEPTH_STENCIL", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_STENCIL_ATTACHMENT(value: GLenum): Self = StObject.set(x, "DEPTH_STENCIL_ATTACHMENT", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_TEST(value: GLenum): Self = StObject.set(x, "DEPTH_TEST", value.asInstanceOf[js.Any])
      
      inline def setDEPTH_WRITEMASK(value: GLenum): Self = StObject.set(x, "DEPTH_WRITEMASK", value.asInstanceOf[js.Any])
      
      inline def setDITHER(value: GLenum): Self = StObject.set(x, "DITHER", value.asInstanceOf[js.Any])
      
      inline def setDONT_CARE(value: GLenum): Self = StObject.set(x, "DONT_CARE", value.asInstanceOf[js.Any])
      
      inline def setDST_ALPHA(value: GLenum): Self = StObject.set(x, "DST_ALPHA", value.asInstanceOf[js.Any])
      
      inline def setDST_COLOR(value: GLenum): Self = StObject.set(x, "DST_COLOR", value.asInstanceOf[js.Any])
      
      inline def setDYNAMIC_DRAW(value: GLenum): Self = StObject.set(x, "DYNAMIC_DRAW", value.asInstanceOf[js.Any])
      
      inline def setELEMENT_ARRAY_BUFFER(value: GLenum): Self = StObject.set(x, "ELEMENT_ARRAY_BUFFER", value.asInstanceOf[js.Any])
      
      inline def setELEMENT_ARRAY_BUFFER_BINDING(value: GLenum): Self = StObject.set(x, "ELEMENT_ARRAY_BUFFER_BINDING", value.asInstanceOf[js.Any])
      
      inline def setEQUAL(value: GLenum): Self = StObject.set(x, "EQUAL", value.asInstanceOf[js.Any])
      
      inline def setFASTEST(value: GLenum): Self = StObject.set(x, "FASTEST", value.asInstanceOf[js.Any])
      
      inline def setFLOAT(value: GLenum): Self = StObject.set(x, "FLOAT", value.asInstanceOf[js.Any])
      
      inline def setFLOAT_MAT2(value: GLenum): Self = StObject.set(x, "FLOAT_MAT2", value.asInstanceOf[js.Any])
      
      inline def setFLOAT_MAT3(value: GLenum): Self = StObject.set(x, "FLOAT_MAT3", value.asInstanceOf[js.Any])
      
      inline def setFLOAT_MAT4(value: GLenum): Self = StObject.set(x, "FLOAT_MAT4", value.asInstanceOf[js.Any])
      
      inline def setFLOAT_VEC2(value: GLenum): Self = StObject.set(x, "FLOAT_VEC2", value.asInstanceOf[js.Any])
      
      inline def setFLOAT_VEC3(value: GLenum): Self = StObject.set(x, "FLOAT_VEC3", value.asInstanceOf[js.Any])
      
      inline def setFLOAT_VEC4(value: GLenum): Self = StObject.set(x, "FLOAT_VEC4", value.asInstanceOf[js.Any])
      
      inline def setFRAGMENT_SHADER(value: GLenum): Self = StObject.set(x, "FRAGMENT_SHADER", value.asInstanceOf[js.Any])
      
      inline def setFRAMEBUFFER(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER", value.asInstanceOf[js.Any])
      
      inline def setFRAMEBUFFER_ATTACHMENT_OBJECT_NAME(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_OBJECT_NAME", value.asInstanceOf[js.Any])
      
      inline def setFRAMEBUFFER_ATTACHMENT_OBJECT_TYPE(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE", value.asInstanceOf[js.Any])
      
      inline def setFRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE", value.asInstanceOf[js.Any])
      
      inline def setFRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL", value.asInstanceOf[js.Any])
      
      inline def setFRAMEBUFFER_BINDING(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_BINDING", value.asInstanceOf[js.Any])
      
      inline def setFRAMEBUFFER_COMPLETE(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_COMPLETE", value.asInstanceOf[js.Any])
      
      inline def setFRAMEBUFFER_INCOMPLETE_ATTACHMENT(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_INCOMPLETE_ATTACHMENT", value.asInstanceOf[js.Any])
      
      inline def setFRAMEBUFFER_INCOMPLETE_DIMENSIONS(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_INCOMPLETE_DIMENSIONS", value.asInstanceOf[js.Any])
      
      inline def setFRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT", value.asInstanceOf[js.Any])
      
      inline def setFRAMEBUFFER_UNSUPPORTED(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_UNSUPPORTED", value.asInstanceOf[js.Any])
      
      inline def setFRONT(value: GLenum): Self = StObject.set(x, "FRONT", value.asInstanceOf[js.Any])
      
      inline def setFRONT_AND_BACK(value: GLenum): Self = StObject.set(x, "FRONT_AND_BACK", value.asInstanceOf[js.Any])
      
      inline def setFRONT_FACE(value: GLenum): Self = StObject.set(x, "FRONT_FACE", value.asInstanceOf[js.Any])
      
      inline def setFUNC_ADD(value: GLenum): Self = StObject.set(x, "FUNC_ADD", value.asInstanceOf[js.Any])
      
      inline def setFUNC_REVERSE_SUBTRACT(value: GLenum): Self = StObject.set(x, "FUNC_REVERSE_SUBTRACT", value.asInstanceOf[js.Any])
      
      inline def setFUNC_SUBTRACT(value: GLenum): Self = StObject.set(x, "FUNC_SUBTRACT", value.asInstanceOf[js.Any])
      
      inline def setGENERATE_MIPMAP_HINT(value: GLenum): Self = StObject.set(x, "GENERATE_MIPMAP_HINT", value.asInstanceOf[js.Any])
      
      inline def setGEQUAL(value: GLenum): Self = StObject.set(x, "GEQUAL", value.asInstanceOf[js.Any])
      
      inline def setGREATER(value: GLenum): Self = StObject.set(x, "GREATER", value.asInstanceOf[js.Any])
      
      inline def setGREEN_BITS(value: GLenum): Self = StObject.set(x, "GREEN_BITS", value.asInstanceOf[js.Any])
      
      inline def setHIGH_FLOAT(value: GLenum): Self = StObject.set(x, "HIGH_FLOAT", value.asInstanceOf[js.Any])
      
      inline def setHIGH_INT(value: GLenum): Self = StObject.set(x, "HIGH_INT", value.asInstanceOf[js.Any])
      
      inline def setIMPLEMENTATION_COLOR_READ_FORMAT(value: GLenum): Self = StObject.set(x, "IMPLEMENTATION_COLOR_READ_FORMAT", value.asInstanceOf[js.Any])
      
      inline def setIMPLEMENTATION_COLOR_READ_TYPE(value: GLenum): Self = StObject.set(x, "IMPLEMENTATION_COLOR_READ_TYPE", value.asInstanceOf[js.Any])
      
      inline def setINCR(value: GLenum): Self = StObject.set(x, "INCR", value.asInstanceOf[js.Any])
      
      inline def setINCR_WRAP(value: GLenum): Self = StObject.set(x, "INCR_WRAP", value.asInstanceOf[js.Any])
      
      inline def setINT(value: GLenum): Self = StObject.set(x, "INT", value.asInstanceOf[js.Any])
      
      inline def setINT_VEC2(value: GLenum): Self = StObject.set(x, "INT_VEC2", value.asInstanceOf[js.Any])
      
      inline def setINT_VEC3(value: GLenum): Self = StObject.set(x, "INT_VEC3", value.asInstanceOf[js.Any])
      
      inline def setINT_VEC4(value: GLenum): Self = StObject.set(x, "INT_VEC4", value.asInstanceOf[js.Any])
      
      inline def setINVALID_ENUM(value: GLenum): Self = StObject.set(x, "INVALID_ENUM", value.asInstanceOf[js.Any])
      
      inline def setINVALID_FRAMEBUFFER_OPERATION(value: GLenum): Self = StObject.set(x, "INVALID_FRAMEBUFFER_OPERATION", value.asInstanceOf[js.Any])
      
      inline def setINVALID_OPERATION(value: GLenum): Self = StObject.set(x, "INVALID_OPERATION", value.asInstanceOf[js.Any])
      
      inline def setINVALID_VALUE(value: GLenum): Self = StObject.set(x, "INVALID_VALUE", value.asInstanceOf[js.Any])
      
      inline def setINVERT(value: GLenum): Self = StObject.set(x, "INVERT", value.asInstanceOf[js.Any])
      
      inline def setKEEP(value: GLenum): Self = StObject.set(x, "KEEP", value.asInstanceOf[js.Any])
      
      inline def setLEQUAL(value: GLenum): Self = StObject.set(x, "LEQUAL", value.asInstanceOf[js.Any])
      
      inline def setLESS(value: GLenum): Self = StObject.set(x, "LESS", value.asInstanceOf[js.Any])
      
      inline def setLINEAR(value: GLenum): Self = StObject.set(x, "LINEAR", value.asInstanceOf[js.Any])
      
      inline def setLINEAR_MIPMAP_LINEAR(value: GLenum): Self = StObject.set(x, "LINEAR_MIPMAP_LINEAR", value.asInstanceOf[js.Any])
      
      inline def setLINEAR_MIPMAP_NEAREST(value: GLenum): Self = StObject.set(x, "LINEAR_MIPMAP_NEAREST", value.asInstanceOf[js.Any])
      
      inline def setLINES(value: GLenum): Self = StObject.set(x, "LINES", value.asInstanceOf[js.Any])
      
      inline def setLINE_LOOP(value: GLenum): Self = StObject.set(x, "LINE_LOOP", value.asInstanceOf[js.Any])
      
      inline def setLINE_STRIP(value: GLenum): Self = StObject.set(x, "LINE_STRIP", value.asInstanceOf[js.Any])
      
      inline def setLINE_WIDTH(value: GLenum): Self = StObject.set(x, "LINE_WIDTH", value.asInstanceOf[js.Any])
      
      inline def setLINK_STATUS(value: GLenum): Self = StObject.set(x, "LINK_STATUS", value.asInstanceOf[js.Any])
      
      inline def setLOW_FLOAT(value: GLenum): Self = StObject.set(x, "LOW_FLOAT", value.asInstanceOf[js.Any])
      
      inline def setLOW_INT(value: GLenum): Self = StObject.set(x, "LOW_INT", value.asInstanceOf[js.Any])
      
      inline def setLUMINANCE(value: GLenum): Self = StObject.set(x, "LUMINANCE", value.asInstanceOf[js.Any])
      
      inline def setLUMINANCE_ALPHA(value: GLenum): Self = StObject.set(x, "LUMINANCE_ALPHA", value.asInstanceOf[js.Any])
      
      inline def setMAX_COMBINED_TEXTURE_IMAGE_UNITS(value: GLenum): Self = StObject.set(x, "MAX_COMBINED_TEXTURE_IMAGE_UNITS", value.asInstanceOf[js.Any])
      
      inline def setMAX_CUBE_MAP_TEXTURE_SIZE(value: GLenum): Self = StObject.set(x, "MAX_CUBE_MAP_TEXTURE_SIZE", value.asInstanceOf[js.Any])
      
      inline def setMAX_FRAGMENT_UNIFORM_VECTORS(value: GLenum): Self = StObject.set(x, "MAX_FRAGMENT_UNIFORM_VECTORS", value.asInstanceOf[js.Any])
      
      inline def setMAX_RENDERBUFFER_SIZE(value: GLenum): Self = StObject.set(x, "MAX_RENDERBUFFER_SIZE", value.asInstanceOf[js.Any])
      
      inline def setMAX_TEXTURE_IMAGE_UNITS(value: GLenum): Self = StObject.set(x, "MAX_TEXTURE_IMAGE_UNITS", value.asInstanceOf[js.Any])
      
      inline def setMAX_TEXTURE_SIZE(value: GLenum): Self = StObject.set(x, "MAX_TEXTURE_SIZE", value.asInstanceOf[js.Any])
      
      inline def setMAX_VARYING_VECTORS(value: GLenum): Self = StObject.set(x, "MAX_VARYING_VECTORS", value.asInstanceOf[js.Any])
      
      inline def setMAX_VERTEX_ATTRIBS(value: GLenum): Self = StObject.set(x, "MAX_VERTEX_ATTRIBS", value.asInstanceOf[js.Any])
      
      inline def setMAX_VERTEX_TEXTURE_IMAGE_UNITS(value: GLenum): Self = StObject.set(x, "MAX_VERTEX_TEXTURE_IMAGE_UNITS", value.asInstanceOf[js.Any])
      
      inline def setMAX_VERTEX_UNIFORM_VECTORS(value: GLenum): Self = StObject.set(x, "MAX_VERTEX_UNIFORM_VECTORS", value.asInstanceOf[js.Any])
      
      inline def setMAX_VIEWPORT_DIMS(value: GLenum): Self = StObject.set(x, "MAX_VIEWPORT_DIMS", value.asInstanceOf[js.Any])
      
      inline def setMEDIUM_FLOAT(value: GLenum): Self = StObject.set(x, "MEDIUM_FLOAT", value.asInstanceOf[js.Any])
      
      inline def setMEDIUM_INT(value: GLenum): Self = StObject.set(x, "MEDIUM_INT", value.asInstanceOf[js.Any])
      
      inline def setMIRRORED_REPEAT(value: GLenum): Self = StObject.set(x, "MIRRORED_REPEAT", value.asInstanceOf[js.Any])
      
      inline def setNEAREST(value: GLenum): Self = StObject.set(x, "NEAREST", value.asInstanceOf[js.Any])
      
      inline def setNEAREST_MIPMAP_LINEAR(value: GLenum): Self = StObject.set(x, "NEAREST_MIPMAP_LINEAR", value.asInstanceOf[js.Any])
      
      inline def setNEAREST_MIPMAP_NEAREST(value: GLenum): Self = StObject.set(x, "NEAREST_MIPMAP_NEAREST", value.asInstanceOf[js.Any])
      
      inline def setNEVER(value: GLenum): Self = StObject.set(x, "NEVER", value.asInstanceOf[js.Any])
      
      inline def setNICEST(value: GLenum): Self = StObject.set(x, "NICEST", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: GLenum): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setNOTEQUAL(value: GLenum): Self = StObject.set(x, "NOTEQUAL", value.asInstanceOf[js.Any])
      
      inline def setNO_ERROR(value: GLenum): Self = StObject.set(x, "NO_ERROR", value.asInstanceOf[js.Any])
      
      inline def setONE(value: GLenum): Self = StObject.set(x, "ONE", value.asInstanceOf[js.Any])
      
      inline def setONE_MINUS_CONSTANT_ALPHA(value: GLenum): Self = StObject.set(x, "ONE_MINUS_CONSTANT_ALPHA", value.asInstanceOf[js.Any])
      
      inline def setONE_MINUS_CONSTANT_COLOR(value: GLenum): Self = StObject.set(x, "ONE_MINUS_CONSTANT_COLOR", value.asInstanceOf[js.Any])
      
      inline def setONE_MINUS_DST_ALPHA(value: GLenum): Self = StObject.set(x, "ONE_MINUS_DST_ALPHA", value.asInstanceOf[js.Any])
      
      inline def setONE_MINUS_DST_COLOR(value: GLenum): Self = StObject.set(x, "ONE_MINUS_DST_COLOR", value.asInstanceOf[js.Any])
      
      inline def setONE_MINUS_SRC_ALPHA(value: GLenum): Self = StObject.set(x, "ONE_MINUS_SRC_ALPHA", value.asInstanceOf[js.Any])
      
      inline def setONE_MINUS_SRC_COLOR(value: GLenum): Self = StObject.set(x, "ONE_MINUS_SRC_COLOR", value.asInstanceOf[js.Any])
      
      inline def setOUT_OF_MEMORY(value: GLenum): Self = StObject.set(x, "OUT_OF_MEMORY", value.asInstanceOf[js.Any])
      
      inline def setPACK_ALIGNMENT(value: GLenum): Self = StObject.set(x, "PACK_ALIGNMENT", value.asInstanceOf[js.Any])
      
      inline def setPOINTS(value: GLenum): Self = StObject.set(x, "POINTS", value.asInstanceOf[js.Any])
      
      inline def setPOLYGON_OFFSET_FACTOR(value: GLenum): Self = StObject.set(x, "POLYGON_OFFSET_FACTOR", value.asInstanceOf[js.Any])
      
      inline def setPOLYGON_OFFSET_FILL(value: GLenum): Self = StObject.set(x, "POLYGON_OFFSET_FILL", value.asInstanceOf[js.Any])
      
      inline def setPOLYGON_OFFSET_UNITS(value: GLenum): Self = StObject.set(x, "POLYGON_OFFSET_UNITS", value.asInstanceOf[js.Any])
      
      inline def setRED_BITS(value: GLenum): Self = StObject.set(x, "RED_BITS", value.asInstanceOf[js.Any])
      
      inline def setRENDERBUFFER(value: GLenum): Self = StObject.set(x, "RENDERBUFFER", value.asInstanceOf[js.Any])
      
      inline def setRENDERBUFFER_ALPHA_SIZE(value: GLenum): Self = StObject.set(x, "RENDERBUFFER_ALPHA_SIZE", value.asInstanceOf[js.Any])
      
      inline def setRENDERBUFFER_BINDING(value: GLenum): Self = StObject.set(x, "RENDERBUFFER_BINDING", value.asInstanceOf[js.Any])
      
      inline def setRENDERBUFFER_BLUE_SIZE(value: GLenum): Self = StObject.set(x, "RENDERBUFFER_BLUE_SIZE", value.asInstanceOf[js.Any])
      
      inline def setRENDERBUFFER_DEPTH_SIZE(value: GLenum): Self = StObject.set(x, "RENDERBUFFER_DEPTH_SIZE", value.asInstanceOf[js.Any])
      
      inline def setRENDERBUFFER_GREEN_SIZE(value: GLenum): Self = StObject.set(x, "RENDERBUFFER_GREEN_SIZE", value.asInstanceOf[js.Any])
      
      inline def setRENDERBUFFER_HEIGHT(value: GLenum): Self = StObject.set(x, "RENDERBUFFER_HEIGHT", value.asInstanceOf[js.Any])
      
      inline def setRENDERBUFFER_INTERNAL_FORMAT(value: GLenum): Self = StObject.set(x, "RENDERBUFFER_INTERNAL_FORMAT", value.asInstanceOf[js.Any])
      
      inline def setRENDERBUFFER_RED_SIZE(value: GLenum): Self = StObject.set(x, "RENDERBUFFER_RED_SIZE", value.asInstanceOf[js.Any])
      
      inline def setRENDERBUFFER_STENCIL_SIZE(value: GLenum): Self = StObject.set(x, "RENDERBUFFER_STENCIL_SIZE", value.asInstanceOf[js.Any])
      
      inline def setRENDERBUFFER_WIDTH(value: GLenum): Self = StObject.set(x, "RENDERBUFFER_WIDTH", value.asInstanceOf[js.Any])
      
      inline def setRENDERER(value: GLenum): Self = StObject.set(x, "RENDERER", value.asInstanceOf[js.Any])
      
      inline def setREPEAT(value: GLenum): Self = StObject.set(x, "REPEAT", value.asInstanceOf[js.Any])
      
      inline def setREPLACE(value: GLenum): Self = StObject.set(x, "REPLACE", value.asInstanceOf[js.Any])
      
      inline def setRGB(value: GLenum): Self = StObject.set(x, "RGB", value.asInstanceOf[js.Any])
      
      inline def setRGB565(value: GLenum): Self = StObject.set(x, "RGB565", value.asInstanceOf[js.Any])
      
      inline def setRGB5_A1(value: GLenum): Self = StObject.set(x, "RGB5_A1", value.asInstanceOf[js.Any])
      
      inline def setRGBA(value: GLenum): Self = StObject.set(x, "RGBA", value.asInstanceOf[js.Any])
      
      inline def setRGBA4(value: GLenum): Self = StObject.set(x, "RGBA4", value.asInstanceOf[js.Any])
      
      inline def setSAMPLER_2D(value: GLenum): Self = StObject.set(x, "SAMPLER_2D", value.asInstanceOf[js.Any])
      
      inline def setSAMPLER_CUBE(value: GLenum): Self = StObject.set(x, "SAMPLER_CUBE", value.asInstanceOf[js.Any])
      
      inline def setSAMPLES(value: GLenum): Self = StObject.set(x, "SAMPLES", value.asInstanceOf[js.Any])
      
      inline def setSAMPLE_ALPHA_TO_COVERAGE(value: GLenum): Self = StObject.set(x, "SAMPLE_ALPHA_TO_COVERAGE", value.asInstanceOf[js.Any])
      
      inline def setSAMPLE_BUFFERS(value: GLenum): Self = StObject.set(x, "SAMPLE_BUFFERS", value.asInstanceOf[js.Any])
      
      inline def setSAMPLE_COVERAGE(value: GLenum): Self = StObject.set(x, "SAMPLE_COVERAGE", value.asInstanceOf[js.Any])
      
      inline def setSAMPLE_COVERAGE_INVERT(value: GLenum): Self = StObject.set(x, "SAMPLE_COVERAGE_INVERT", value.asInstanceOf[js.Any])
      
      inline def setSAMPLE_COVERAGE_VALUE(value: GLenum): Self = StObject.set(x, "SAMPLE_COVERAGE_VALUE", value.asInstanceOf[js.Any])
      
      inline def setSCISSOR_BOX(value: GLenum): Self = StObject.set(x, "SCISSOR_BOX", value.asInstanceOf[js.Any])
      
      inline def setSCISSOR_TEST(value: GLenum): Self = StObject.set(x, "SCISSOR_TEST", value.asInstanceOf[js.Any])
      
      inline def setSHADER_TYPE(value: GLenum): Self = StObject.set(x, "SHADER_TYPE", value.asInstanceOf[js.Any])
      
      inline def setSHADING_LANGUAGE_VERSION(value: GLenum): Self = StObject.set(x, "SHADING_LANGUAGE_VERSION", value.asInstanceOf[js.Any])
      
      inline def setSHORT(value: GLenum): Self = StObject.set(x, "SHORT", value.asInstanceOf[js.Any])
      
      inline def setSRC_ALPHA(value: GLenum): Self = StObject.set(x, "SRC_ALPHA", value.asInstanceOf[js.Any])
      
      inline def setSRC_ALPHA_SATURATE(value: GLenum): Self = StObject.set(x, "SRC_ALPHA_SATURATE", value.asInstanceOf[js.Any])
      
      inline def setSRC_COLOR(value: GLenum): Self = StObject.set(x, "SRC_COLOR", value.asInstanceOf[js.Any])
      
      inline def setSTATIC_DRAW(value: GLenum): Self = StObject.set(x, "STATIC_DRAW", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_ATTACHMENT(value: GLenum): Self = StObject.set(x, "STENCIL_ATTACHMENT", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_BACK_FAIL(value: GLenum): Self = StObject.set(x, "STENCIL_BACK_FAIL", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_BACK_FUNC(value: GLenum): Self = StObject.set(x, "STENCIL_BACK_FUNC", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_BACK_PASS_DEPTH_FAIL(value: GLenum): Self = StObject.set(x, "STENCIL_BACK_PASS_DEPTH_FAIL", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_BACK_PASS_DEPTH_PASS(value: GLenum): Self = StObject.set(x, "STENCIL_BACK_PASS_DEPTH_PASS", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_BACK_REF(value: GLenum): Self = StObject.set(x, "STENCIL_BACK_REF", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_BACK_VALUE_MASK(value: GLenum): Self = StObject.set(x, "STENCIL_BACK_VALUE_MASK", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_BACK_WRITEMASK(value: GLenum): Self = StObject.set(x, "STENCIL_BACK_WRITEMASK", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_BITS(value: GLenum): Self = StObject.set(x, "STENCIL_BITS", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_BUFFER_BIT(value: GLenum): Self = StObject.set(x, "STENCIL_BUFFER_BIT", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_CLEAR_VALUE(value: GLenum): Self = StObject.set(x, "STENCIL_CLEAR_VALUE", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_FAIL(value: GLenum): Self = StObject.set(x, "STENCIL_FAIL", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_FUNC(value: GLenum): Self = StObject.set(x, "STENCIL_FUNC", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_INDEX8(value: GLenum): Self = StObject.set(x, "STENCIL_INDEX8", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_PASS_DEPTH_FAIL(value: GLenum): Self = StObject.set(x, "STENCIL_PASS_DEPTH_FAIL", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_PASS_DEPTH_PASS(value: GLenum): Self = StObject.set(x, "STENCIL_PASS_DEPTH_PASS", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_REF(value: GLenum): Self = StObject.set(x, "STENCIL_REF", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_TEST(value: GLenum): Self = StObject.set(x, "STENCIL_TEST", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_VALUE_MASK(value: GLenum): Self = StObject.set(x, "STENCIL_VALUE_MASK", value.asInstanceOf[js.Any])
      
      inline def setSTENCIL_WRITEMASK(value: GLenum): Self = StObject.set(x, "STENCIL_WRITEMASK", value.asInstanceOf[js.Any])
      
      inline def setSTREAM_DRAW(value: GLenum): Self = StObject.set(x, "STREAM_DRAW", value.asInstanceOf[js.Any])
      
      inline def setSUBPIXEL_BITS(value: GLenum): Self = StObject.set(x, "SUBPIXEL_BITS", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE(value: GLenum): Self = StObject.set(x, "TEXTURE", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE0(value: GLenum): Self = StObject.set(x, "TEXTURE0", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE1(value: GLenum): Self = StObject.set(x, "TEXTURE1", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE10(value: GLenum): Self = StObject.set(x, "TEXTURE10", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE11(value: GLenum): Self = StObject.set(x, "TEXTURE11", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE12(value: GLenum): Self = StObject.set(x, "TEXTURE12", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE13(value: GLenum): Self = StObject.set(x, "TEXTURE13", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE14(value: GLenum): Self = StObject.set(x, "TEXTURE14", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE15(value: GLenum): Self = StObject.set(x, "TEXTURE15", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE16(value: GLenum): Self = StObject.set(x, "TEXTURE16", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE17(value: GLenum): Self = StObject.set(x, "TEXTURE17", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE18(value: GLenum): Self = StObject.set(x, "TEXTURE18", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE19(value: GLenum): Self = StObject.set(x, "TEXTURE19", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE2(value: GLenum): Self = StObject.set(x, "TEXTURE2", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE20(value: GLenum): Self = StObject.set(x, "TEXTURE20", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE21(value: GLenum): Self = StObject.set(x, "TEXTURE21", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE22(value: GLenum): Self = StObject.set(x, "TEXTURE22", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE23(value: GLenum): Self = StObject.set(x, "TEXTURE23", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE24(value: GLenum): Self = StObject.set(x, "TEXTURE24", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE25(value: GLenum): Self = StObject.set(x, "TEXTURE25", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE26(value: GLenum): Self = StObject.set(x, "TEXTURE26", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE27(value: GLenum): Self = StObject.set(x, "TEXTURE27", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE28(value: GLenum): Self = StObject.set(x, "TEXTURE28", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE29(value: GLenum): Self = StObject.set(x, "TEXTURE29", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE3(value: GLenum): Self = StObject.set(x, "TEXTURE3", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE30(value: GLenum): Self = StObject.set(x, "TEXTURE30", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE31(value: GLenum): Self = StObject.set(x, "TEXTURE31", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE4(value: GLenum): Self = StObject.set(x, "TEXTURE4", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE5(value: GLenum): Self = StObject.set(x, "TEXTURE5", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE6(value: GLenum): Self = StObject.set(x, "TEXTURE6", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE7(value: GLenum): Self = StObject.set(x, "TEXTURE7", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE8(value: GLenum): Self = StObject.set(x, "TEXTURE8", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE9(value: GLenum): Self = StObject.set(x, "TEXTURE9", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_2D(value: GLenum): Self = StObject.set(x, "TEXTURE_2D", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_BINDING_2D(value: GLenum): Self = StObject.set(x, "TEXTURE_BINDING_2D", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_BINDING_CUBE_MAP(value: GLenum): Self = StObject.set(x, "TEXTURE_BINDING_CUBE_MAP", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_CUBE_MAP(value: GLenum): Self = StObject.set(x, "TEXTURE_CUBE_MAP", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_CUBE_MAP_NEGATIVE_X(value: GLenum): Self = StObject.set(x, "TEXTURE_CUBE_MAP_NEGATIVE_X", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_CUBE_MAP_NEGATIVE_Y(value: GLenum): Self = StObject.set(x, "TEXTURE_CUBE_MAP_NEGATIVE_Y", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_CUBE_MAP_NEGATIVE_Z(value: GLenum): Self = StObject.set(x, "TEXTURE_CUBE_MAP_NEGATIVE_Z", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_CUBE_MAP_POSITIVE_X(value: GLenum): Self = StObject.set(x, "TEXTURE_CUBE_MAP_POSITIVE_X", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_CUBE_MAP_POSITIVE_Y(value: GLenum): Self = StObject.set(x, "TEXTURE_CUBE_MAP_POSITIVE_Y", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_CUBE_MAP_POSITIVE_Z(value: GLenum): Self = StObject.set(x, "TEXTURE_CUBE_MAP_POSITIVE_Z", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_MAG_FILTER(value: GLenum): Self = StObject.set(x, "TEXTURE_MAG_FILTER", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_MIN_FILTER(value: GLenum): Self = StObject.set(x, "TEXTURE_MIN_FILTER", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_WRAP_S(value: GLenum): Self = StObject.set(x, "TEXTURE_WRAP_S", value.asInstanceOf[js.Any])
      
      inline def setTEXTURE_WRAP_T(value: GLenum): Self = StObject.set(x, "TEXTURE_WRAP_T", value.asInstanceOf[js.Any])
      
      inline def setTRIANGLES(value: GLenum): Self = StObject.set(x, "TRIANGLES", value.asInstanceOf[js.Any])
      
      inline def setTRIANGLE_FAN(value: GLenum): Self = StObject.set(x, "TRIANGLE_FAN", value.asInstanceOf[js.Any])
      
      inline def setTRIANGLE_STRIP(value: GLenum): Self = StObject.set(x, "TRIANGLE_STRIP", value.asInstanceOf[js.Any])
      
      inline def setUNPACK_ALIGNMENT(value: GLenum): Self = StObject.set(x, "UNPACK_ALIGNMENT", value.asInstanceOf[js.Any])
      
      inline def setUNPACK_COLORSPACE_CONVERSION_WEBGL(value: GLenum): Self = StObject.set(x, "UNPACK_COLORSPACE_CONVERSION_WEBGL", value.asInstanceOf[js.Any])
      
      inline def setUNPACK_FLIP_Y_WEBGL(value: GLenum): Self = StObject.set(x, "UNPACK_FLIP_Y_WEBGL", value.asInstanceOf[js.Any])
      
      inline def setUNPACK_PREMULTIPLY_ALPHA_WEBGL(value: GLenum): Self = StObject.set(x, "UNPACK_PREMULTIPLY_ALPHA_WEBGL", value.asInstanceOf[js.Any])
      
      inline def setUNSIGNED_BYTE(value: GLenum): Self = StObject.set(x, "UNSIGNED_BYTE", value.asInstanceOf[js.Any])
      
      inline def setUNSIGNED_INT(value: GLenum): Self = StObject.set(x, "UNSIGNED_INT", value.asInstanceOf[js.Any])
      
      inline def setUNSIGNED_SHORT(value: GLenum): Self = StObject.set(x, "UNSIGNED_SHORT", value.asInstanceOf[js.Any])
      
      inline def setUNSIGNED_SHORT_4_4_4_4(value: GLenum): Self = StObject.set(x, "UNSIGNED_SHORT_4_4_4_4", value.asInstanceOf[js.Any])
      
      inline def setUNSIGNED_SHORT_5_5_5_1(value: GLenum): Self = StObject.set(x, "UNSIGNED_SHORT_5_5_5_1", value.asInstanceOf[js.Any])
      
      inline def setUNSIGNED_SHORT_5_6_5(value: GLenum): Self = StObject.set(x, "UNSIGNED_SHORT_5_6_5", value.asInstanceOf[js.Any])
      
      inline def setVALIDATE_STATUS(value: GLenum): Self = StObject.set(x, "VALIDATE_STATUS", value.asInstanceOf[js.Any])
      
      inline def setVENDOR(value: GLenum): Self = StObject.set(x, "VENDOR", value.asInstanceOf[js.Any])
      
      inline def setVERSION(value: GLenum): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
      
      inline def setVERTEX_ATTRIB_ARRAY_BUFFER_BINDING(value: GLenum): Self = StObject.set(x, "VERTEX_ATTRIB_ARRAY_BUFFER_BINDING", value.asInstanceOf[js.Any])
      
      inline def setVERTEX_ATTRIB_ARRAY_ENABLED(value: GLenum): Self = StObject.set(x, "VERTEX_ATTRIB_ARRAY_ENABLED", value.asInstanceOf[js.Any])
      
      inline def setVERTEX_ATTRIB_ARRAY_NORMALIZED(value: GLenum): Self = StObject.set(x, "VERTEX_ATTRIB_ARRAY_NORMALIZED", value.asInstanceOf[js.Any])
      
      inline def setVERTEX_ATTRIB_ARRAY_POINTER(value: GLenum): Self = StObject.set(x, "VERTEX_ATTRIB_ARRAY_POINTER", value.asInstanceOf[js.Any])
      
      inline def setVERTEX_ATTRIB_ARRAY_SIZE(value: GLenum): Self = StObject.set(x, "VERTEX_ATTRIB_ARRAY_SIZE", value.asInstanceOf[js.Any])
      
      inline def setVERTEX_ATTRIB_ARRAY_STRIDE(value: GLenum): Self = StObject.set(x, "VERTEX_ATTRIB_ARRAY_STRIDE", value.asInstanceOf[js.Any])
      
      inline def setVERTEX_ATTRIB_ARRAY_TYPE(value: GLenum): Self = StObject.set(x, "VERTEX_ATTRIB_ARRAY_TYPE", value.asInstanceOf[js.Any])
      
      inline def setVERTEX_SHADER(value: GLenum): Self = StObject.set(x, "VERTEX_SHADER", value.asInstanceOf[js.Any])
      
      inline def setVIEWPORT(value: GLenum): Self = StObject.set(x, "VIEWPORT", value.asInstanceOf[js.Any])
      
      inline def setZERO(value: GLenum): Self = StObject.set(x, "ZERO", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserAgent extends StObject {
    
    var userAgent: String
  }
  object UserAgent {
    
    inline def apply(userAgent: String): UserAgent = {
      val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgent]
    }
    
    extension [Self <: UserAgent](x: Self) {
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    }
  }
}
